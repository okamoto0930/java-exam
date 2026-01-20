package ennsyuu;

public class Robot implements Electrical,Human{

@Override
public void power(){
    System.out.println("ロボットの電源が入りました");
}

@Override
    public void walk(){
        System.out.println("ロボットが歩きました");
    }

@Override
    public void talk(){
        System.out.println("ロボットが話しました");
    }
    
}
