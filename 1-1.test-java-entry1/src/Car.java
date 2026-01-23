//演習31
public class Car {

    private int speed;

    public void run(int speed){

        if(speed<0||speed>=180){
            throw new IllegalArgumentException("スピードの出しすぎです");
        }

        //thisにするのはどっちのspeedか分からなくなるから（クラスのspeedかメソッドのspeedか）
        this.speed=speed;
        System.out.println("スピードが"+speed+"km/hになりました。");

    }
}
