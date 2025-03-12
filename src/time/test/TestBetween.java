package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
//  Q : 시작 날짜와 목표 날짜를 입력해서 남은 기간와 디데이를 구하라.
//    : "남은 기간 : x년 x개월 x일" 형식으로 출력하라.
//    : "디데이 : x일 남음" 형식으로 출력하라
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2025, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 7, 16);

        System.out.println("시작 날짜 : " + startDate);
        System.out.println("목표 날짜 : " + endDate);

        Period between = Period.between(startDate, endDate); // P6M15D
        System.out.println("남은 기간 : " + between.getYears()  + "년 " + between.getMonths() + "개월 " + between.getDays() + "일");
        System.out.println("디데이 : " + ChronoUnit.DAYS.between(startDate, endDate) + "일 남음");
    }
}
