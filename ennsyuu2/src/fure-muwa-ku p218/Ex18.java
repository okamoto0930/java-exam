//演習32　コレクションフレームワーク

import java.util.ArrayList;

public class Ex18 {
    public static void main(String[] args) {
        
        //指定どうりインスタンス化する
        //このArrayListにはStringしか入りませんよの意味
        ArrayList<String> list = new ArrayList<String> ();

        
         //名前を追加する
        list.add("伊賀");
        list.add("山田");
        list.add("佐藤");
        list.add("田中");


        for (String name : list) {
        System.out.println(name);
}

    }
}
