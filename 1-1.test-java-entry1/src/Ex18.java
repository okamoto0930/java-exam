
//演習32コレクションフレームワーク
import java.util.ArrayList;

public class Ex18 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();

        list.add("伊賀さん");
        list.add("山田さん");
        list.add("佐藤さん");
        list.add("田中さん");
        
        for(String name:list){
        System.out.println(name);
        }
    }
}
