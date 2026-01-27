package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * 
 * DBに接続と切断を管理するクラス
 * 
 * @author igamasayuki
 * 
 */

    public class DBManager {
        private final static String URL ="jdbc:postgresql://localhost:5432/student";
        private final static String USER_NAME ="postgres";
        private final static String PASSWORD ="postgres";


/**
 * 
 * データベースに接続します
 * 
 * @return　接続情報
 * 
 * 
 */
        public static Connection creaConnection(){
        try{
        Connection con
        =DriverManager.getConnection(URL,USER_NAME,PASSWORD);
        return con;
        }catch(Exception e){
        e.printStackTrace();
        throw new RuntimeException("DB接続に失敗しました");
        }
        }
/**
 * 
 * データベースから切断します。
 * 
 * 
 * 
 * 
 * @param con　接続オブジェクト
 */



public static void closeConnnection(Connection con){

    //(6)メモリの開放(切断)
    try{
        if(con!=null){
            con.close();
        }
    }catch(SQLException e){
        e.printStackTrace();
        throw new RuntimeException("DBの接続に失敗しました");
    }
    }
}
