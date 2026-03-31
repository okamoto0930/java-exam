public class Student {

    int energy =50;
    public Student(int energy) {
        this.energy = energy;
    }

    public void sleep(){
        energy=energy+50;
        if(100<=energy){
            System.out.println("寝ました。エネルギーが"+energy+"になりました。");
        }else if(energy==100){
            System.out.println("フルパワー！");
        }   
    }
    
    public void study(){
        energy=energy-30;
        if(energy<=0){
            System.out.println("勉強しました。エネルギーが"+energy+"になりました。");
        }else if(energy==0){
            System.out.println("寝てください。");
        }
    }
}
