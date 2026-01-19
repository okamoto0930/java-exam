package object_basic;

public class Taxi extends Car{

Taxi taxi =new Taxi();

taxi.speed =0;
taxi.name="タクシー使用のプリウス"
taxi.stepOnAccele();
taxi.stepOnAccele();
taxi.stepOnBrake();
}

//追記
int price;
void payment(){
    System.out.println("料金を"+price+"支払いました");
    price =0;
}
//carクラスのメソッドをオーバーライド
@Override
void stepOnAccele(){
    super.stepOnAccele();
    //speed=speed+10 p139
    //System.out.println("スピードが"+speed+"km/hに増えました");

    price= price+90;
    System.out.println("料金が"+price+"円増えました");
}
