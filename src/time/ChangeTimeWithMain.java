package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2002, 7, 16, 10, 17, 11, 11);
        System.out.println("dt : " + dt);

//      PLUS : Temporal | with() <불변>
//        > 변경하고싶은 특정 값을 변경하여 새로운 값을 반환.
//        > 단순한 날짜 변경.
        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2025);
        System.out.println("changedDt1 : " + changedDt1);

//      FIXME : 편의 메서드 제공.
        LocalDateTime changedDt2 = dt.withYear(2025);
        System.out.println("changedDt2 : " + changedDt2);

//      TemporalAdjusters
//        > 날짜 변경을 쉽게 할 수 있는 구현체 제공.
//        > 복잡한 날짜 변경.
//        > ex) next(DayOfWeek.FRIDAY) : 다음 금요일
//        > ex) lastInMonth(DayOfWeek.SUNDAY) : 이번달의 마지막 일요일
        LocalDateTime nextFri = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("dt : " + dt);
        System.out.println("nextFri (다음주 금요일) : " + nextFri);

        LocalDateTime lastInMonthSun = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("dt : " + dt);
        System.out.println("lastInMonthSun (이번달의 마지막 일요일) : " + lastInMonthSun);
    }
}
