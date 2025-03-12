package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
//  날짜와 시간을 조회하기 위하여 ChronoFiled 를 사용.
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 14, 30);
        System.out.println("dt : " + dt);

//      PLUS : get()
//        > TemporalAccessor 인터페이스를 구현
//        > LocalDateTime 을 포함한 특정 시점의 시간을 조회하는 기능을 제공.
        System.out.println("YEAR : " + dt.get(ChronoField.YEAR));
        System.out.println("MONTH_OF_YEAR : " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH : " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY : " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR : " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTE : " + dt.get(ChronoField.SECOND_OF_MINUTE));

//      FIXME : 편의 메서드 제공
        System.out.println("편의 메서드 존재");
        System.out.println("getYear : " + dt.getYear());
        System.out.println("getMonthValue : " + dt.getMonthValue());
        System.out.println("getDayOfMonth : " + dt.getDayOfMonth());
        System.out.println("getHour : " + dt.getHour());
        System.out.println("getMinute : " + dt.getMinute());
        System.out.println("getSecond : " + dt.getSecond());

        System.out.println("편의 메서드 미존재");
        System.out.println("MINUTE OF DAY : " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND OF DAY : " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}
