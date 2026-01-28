package Sample.7-1.test-dbaccess.src.exam;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 雛形クラスです.<br>
 * これをコピーペーストして問題を解いて構いません。
 * 
 * @author igamasayuki
 */
public class Exam1 {
	public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "postgres";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			sql = " INSERT test_members INTO (id ,name ,age ,dep_id) VALUES(? ,? ,? ,?)";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			// ※ここにSQL実行処理を書く
            pstmt.setInt(1, 1);
            pstmt.setString(2,"山田太郎");
            pstmt.setInt(3,62 );
            pstmt.setInt(4,1);

            pstmt.setInt(1,2);
            pstmt.setString(2,"佐藤花子");
            pstmt.setInt(3,33);
            pstmt.setInt(4,2);

            pstmt.setInt(1,3);
            pstmt.setString(2,"遠藤次郎");
            pstmt.setInt(3,55);
            pstmt.setInt(4,2);


			
			// (5)結果の操作
			// ※ここに結果の操作処理を書く
            

		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			try {
				// (6) メモリの解放(切断)
				con.close();
			} catch (Exception ex) {}
		}
	}
}
