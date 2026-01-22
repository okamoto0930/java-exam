//p211エラー
public class ExceptionSample4 {

    public static void main(String[] args) {
        System.out.println("プログラムを開始");

        try {
            method1();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
        System.out.println("プログラム終了");
    }
        public static void method1() throws ClassNotFoundException{
            Class.forName("java.langNotExistClass");
            
                
            
        }
    }
    