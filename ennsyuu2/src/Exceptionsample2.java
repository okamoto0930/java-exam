//エラー
public class Exceptionsample2 {
    public static void main(String[] args) {
        System.out.println("プログラム開始");

        //検査例外が発生するブロックをtryブロックで囲む
        try {
            Class.forName("java.lang.notExistClass");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("プログラム終了");
        
            
    
    }
}
