import java.util.ArrayList;

public class Ex19 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();

        list.add("伊賀");
        list.add("山田");
        list.add("田中");
        list.add("佐藤");

        list.remove(1);
        list.add(1,"鈴木");

        String three =list.get(2);
        System.out.println(three);

        for(String name:list){
            System.out.println(name);
        }
    }
}
