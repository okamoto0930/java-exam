package ennsyuu;
import Exam1.Car;
//p165
import object_basic.Bus;

public class Polymorphizm２ {
    public static void main(String[] args) {

        Car car =null;
        car= new taxi();

        car.stepOnAccelel();

        car =new Bus();

        car.stepOnAccele();
    }
}
