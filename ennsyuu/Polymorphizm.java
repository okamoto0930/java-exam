package ennsyuu;
//ポリモーフィズム
public class Polymorphizm {
   public static void main(String[] args) {
    //親クラスの参照変数に子クラスのオブジェクトを代入
    //→Carクラスのフィールドメソッドしか使えない
    Car car =new Taxi();

    
    car.stepOnAccele();
    car.stepOnBank();

   } 
}
