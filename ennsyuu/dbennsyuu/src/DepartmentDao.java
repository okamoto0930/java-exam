import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class DepartmentDao {
	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 * @return　メンバー情報(検索されなかった場合はnullが返ります)
	 */
	public Department load(int id){

		Connection con = DBManager.createConnection();

		String sql = "SELECT id,name FROM Departments WHERE id =?";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, id);
			ResultSet rs =pstmt.executeQuery();

			if(rs.next()){

				int departmentid =rs.getInt("id");
				String departmentname =rs.getString("name");
			
				Department department =new Department();
				return department;
		
			}
			
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
	