package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
//  Q : 입력 받은 날의 첫날 요일과, 마지막 날 요일을 구하라.
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

//      입력 받은 날의 첫날 생성.
        LocalDate localDate = LocalDate.of(year, month, 1);
        System.out.println("localDate : " + localDate);

//      DayOfWeek : "월화수목금토일" 을 나타내는 열거형
//      getDayOfWeek() : 해당하는 날짜의 요일을 출력.
        DayOfWeek firstDayOfWeek = localDate.getDayOfWeek();

//      with() : 변경하고싶은 특정 값을 변경하여 새로운 값을 반환.
//      lastDayOfMonth() : 해당 월의 마지막 날.
        DayOfWeek lastDayOFWeek = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek : " + firstDayOfWeek);
        System.out.println("lastDayOFWeek : " + lastDayOFWeek);
    }
}
