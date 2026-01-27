//p274
package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeDao{
     private static final String TABLE_NAME ="emploees";   //テーブル名

    /**
     * 
     * employeesテーブルの主キーを元にEmployeeオブジェクトをロードする
     * 
     * @param id
     *      employeesテーブルの主キーを元にEmployeeオブジェクトをロードする   
     * 
     * 
     * @return　主キーに対応するテーブルの行の情報を持つEmployeeオブジェクト
     * 
     * 
     */


     public Employee load(int id){
        Connection con =DBManager.createConnection();   //接続

        //実行するSQL文(fromの次とWhereの前に半角スペースを入れています)
        String sql ="SELECT id,name,age,gendar,department_id FROM "
        +TABLE_NAME +"WHERE id=?";

        try{   //SQLExceptionが発生するための例外処理
        PreparedStatement pstmt =con.prepareStatement(sql);   //SQL発行準備
        //SQLの1番目の「?」の部分に値(id)をセットする
        pstmt.setInt(1,id);
        ResultSet rs =pstmt.executeQuery();   //SQLの実行



        //結果の取り出し
        if(rs.next()){
        //結果があった場合の処理
        Employee employee =new Employee();
        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setAge(rs.getInt("age"));
        employee.setGender(rs.getString("gender"));
        employee.setDepartmentId(rs.getInt("department_id"));
        return employee;
        }
        return null;   //指定idの行がない場合などはnullを返す。
        }catch(SQLException ex){
            System.err.println("SQL="+sql);   //発行したSQLを出力
            throw new RuntimeException("load 処理に失敗しました",ex);
        }finally{
            DBManager.closeConnection(con);   //切断
        }     
        }
     }
public int insert(Employee employee){
    Connection con =DBManager.creataConnection();
    String sql ="INSERT INTO"+TABLE_NAME
    +"    (id,name,age,gender,department_id)"
    +"VALUES(? ,? ,? , ? , ?)";

    try{
        PreparedStatement pstmt =con.prepareStatement(sql);


        //SQLの「？」の部分にそれぞれ値をセットする。
        pstmt.setInt(1,employee.getId());
        pstmt.setString(2,employee.getName());
        pstmt.setInt(3,employee.getAge());
        pstmt.setString(4,employee.getGender());
        pstmt.setInt(5,employee.getDepartmentId());


        int affected =pstmt.executeUpdate();
        return 
    }
}
