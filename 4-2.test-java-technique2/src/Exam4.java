import java.util.HashMap;

public class Exam4 {
    public static void main(String[] args) {
        HashMap<String ,String> list =new HashMap<>();

        list.put("東京", "東京");
        list.put("埼玉", "さいたま");
        list.put("茨城", "水戸");
        list.put("沖縄", "那覇");

        String name1=list.get("埼玉");
        System.out.println("埼玉の県庁所在地は"+name1+"です");

        String name2=list.get("沖縄");
        System.out.println("沖縄の県庁所在地は"+name2+"です");

    }
}
