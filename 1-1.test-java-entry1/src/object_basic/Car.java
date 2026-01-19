package object_basic;
//演習13(オブジェクト指向概要)
public class Car {
    private int speed;
    private String name;
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGasoline() {
        return gasoline;
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }

    private int gasoline;

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
