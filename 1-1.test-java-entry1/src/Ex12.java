//演習30　例外処理
public class Ex12 {
    public static void main(String[] args) {
        
        try {
            Class.forName("java.lang. java.lang.NotFoundClass");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
