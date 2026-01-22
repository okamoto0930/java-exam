//エラー
public class ExceptionSample3 {
    public static void main(String[] args) {
        System.out.println("プログラム開始");
    
    try{
        Class.forName("Java.long.NotExistClass");
        System.out.println("例外が発生しませんでした");
    }catch(Exception e){
        System.out.println("例外が発生しました");
    }
    catch(Exception e){
        System.out.println("その他の例外が発生しました");
    }finally{
        System.out.println("finally ブロックが実行されました");
    }
    System.out.println("プログラム終了");
    }
    }
