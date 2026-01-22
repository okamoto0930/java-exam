public class Ex14 {

    //method1()は自分でtry catchできない。理由→try catchをmainで行う指示のため。なのでClassNotFoundExceptionを投げますと宣言している
    
    public static void method1() throws ClassNotFoundException{
        Class.forName("java.lang.NonExistClass");
    }

    public static void main(String[] args) {
        try{
            method1();
        }catch        
    }
}
