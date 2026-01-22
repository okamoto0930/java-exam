//コレクションフレームワークp219
import java.util.ArrayList;
import java.util.List;

public class CollectionSample1 {
    public static void main(String[] args) {
        

        List<String> list =new ArrayList<>();


        list.add("スイム");
        list.add("バイク");
        list.add("ラン");

        System.out.println("通常のfor文を使用してArrayList内の要素を一つずつ表示");
        for(int i =0 ;i<list.size() ;i++){
            String element =list.get(i);
            System.out.println(element);
        }



        System.out.println("拡張はfor文を使用してArrayList内の要素を一つずつ表示");
        for(String element:list){
            System.out.println(element);
        }

    }

}
