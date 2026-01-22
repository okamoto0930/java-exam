package ennsyuu;
//演習29－1　クラスライブラリ

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
public class Ex07 {
    public static void main(String[] args) {
        
        // 自分の誕生日を設定（例：2016年2月8日
        LocalDate birthday =LocalDate.of(2000,9,30);

        // 年・月・日を int 型で取得
        int year =birthday.getYear();
        int month =birthday.getMonthValue();
        int day =birthday.getDayOfMonth();

        //表示
        System.out.println("私の誕生日は"+year+"年"+month+"月"+day+"日です");
    }
}
