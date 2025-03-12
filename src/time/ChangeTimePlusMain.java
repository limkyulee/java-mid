package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

//  날짜와 시간을 조회하기 위하여 ChronoUnit 을 사용.
public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2002, 7, 16, 10, 17, 11, 11);
        System.out.println("dt : " + dt);

//      PLUS : plus()
//        > Temporal 인터페이스를 구현
//        > LocalDateTime 을 포함한 특정 시점의 시간을 조작하는 기능을 제공.
        LocalDateTime plusDt = dt.plus(23, ChronoUnit.YEARS);
        System.out.println("plusDt : " + plusDt);

//      FIXME : 편의 메서드 제공.
        LocalDateTime plusDt2 = dt.plusYears(23);
        System.out.println("plusDt2 : " + plusDt2);

//      기간의 설정하고, plus() 로 더해주는 로직도 사용 가능.
        Period period = Period.ofYears(23);
        LocalDateTime plusDt3 = dt.plus(period);
        System.out.println("period : " + period);
        System.out.println("plusDt3 : " + plusDt3);
    }
}
