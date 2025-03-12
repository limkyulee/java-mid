package time.test;

import java.time.LocalDateTime;

public class TestPlus {
//  Q : 2024년 1월 1일 0시 0분 0초에 1년 2개월 3일 4시간 후의 시각을 구하라.
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
//      메서드 체이닝 사용 가능.
        LocalDateTime plusDateTime = localDateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

        System.out.println("localDateTime : " + localDateTime);
        System.out.println("plusDateTime : " + plusDateTime);
    }
}
