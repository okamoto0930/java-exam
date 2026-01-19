//演習13(オブジェクト指向概要)
public class Car {
    int speed;
    String name;
    int gasoline;

void stepOnAccele(){
    speed =speed+10;
    gasoline=gasoline-10;
    System.out.println("速度が10増えました"+"ガソリンは10減りました");
}

void stepOnBrake(){
    speed=speed-10;
    System.out.println("速度が10減りました");
}

void refuel(int newGasoline) {
    gasoline=gasoline-10;
    System.out.println();
}
