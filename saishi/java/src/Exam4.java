import java.util.ArrayList;

public class Exam4 {
    public static void main(String[] args) {

    ArrayList<Employee> employee =new ArrayList<>();

    employee.add(new Employee("後藤",31));
    employee.add(new Employee("山田",28));
    employee.add(new Employee("佐藤",25));
    employee.add(new Employee("田中",19));

    for(Employee answer :employee){
        System.out.println(answer.getName()+answer.getAge()+"歳");

    }
    }
}


