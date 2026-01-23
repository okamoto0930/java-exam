//演習31
public class Ex15 {
    public static void main(String[] args) {
      
        //carクラスのインスタンス化
        Car car =new Car();

        //carクラスのrunメソッドに引数を40渡す。
        car.run(40);

        try{
        car.run(200);
        }catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
        }



    }
}
