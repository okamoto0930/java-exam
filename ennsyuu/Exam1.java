package ennsyuu;

import Exam1.Car;

public class Exam1 {
    public static void main(String[] args) {

        //CarクラスからCarオブジェクトをインスタンス化
        Car Exam1 =new Car();
        Exam1.speed =50;

        Exam1.run();
        Exam1.run();
        Exam1.run();

        
        System.out.println("走りました。スピードが"+Exam1.speed+"になりました。");
       
    }
}
