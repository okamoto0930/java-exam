package ennsyuu;

public class Car {
    int speed;

    void run(){
        speed=speed+50;
        System.out.println("走りました。スピードが○○km/hになりました。");
        if(speed>=120){
            System.out.println("スピードの出しすぎです");
        }
    }
    

}
