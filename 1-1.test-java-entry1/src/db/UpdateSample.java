package db;
//サンプルコードp260
import jaql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateSample {
    public static void main(String[] args) {
        //接続情報

        String url ="jdbc:postgresql://localhost:5432/student";
        String user ="postgres"
        String password ="postgres"


        Connection con =null; //使用する変数の宣言
        PreparedStatement pstmt =null;
        String sql =null;

        try{
            //(1)データベースに接続

            con =DriverManager.getConnection(url,user,password);

            //(2)SQLに接続
            sql="INSERT INTO employees(name,age) VALUES (テスト太郎);";

            //(3)SQLに実行準備
            pstmt =con.prepareStatement(sql);

            //(4)SQL実行
            int numOfUpdate=pstmt.executeUpdate();//insertの場合、結果は1

            //(5)結果の出力(行数のみ表示)
            System.out.println(numOfUpdate+"件のデータを操作しました");

        }catch(SQLException ex){
            System.err.println("SQL="+sql);
            ex.printStackTrace();
            }finally{
                if(con!=null){
                    con.close();
                }
                if(pstmt!=null){
                    pstmt.close();
                }
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

    }
}
