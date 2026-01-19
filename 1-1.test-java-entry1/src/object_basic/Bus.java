package object_basic;

public class Bus extends Car{

    int price;

    @Override
    void stepOnAccele(){
       Car.stepOnAccele ();
        speed=speed+10;
        System.out.println("スピードが"+speed+"増えました");

        price=price+30;
        System.out.println("料金が"+price+"増えました");
    }
}
