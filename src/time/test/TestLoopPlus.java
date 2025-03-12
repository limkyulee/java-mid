package time.test;

import java.time.LocalDate;

public class TestLoopPlus {
//  Q : 2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력하라.
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
//            FIXME : 정답 코드
//            LocalDate plusDate = localDate.plus(2 * i, ChronoUnit.WEEKS);
//            System.out.println("날짜" + (i + 1) + " : " + plusDate);

//            FIXME : 내가 작성한 코드
            LocalDate plusDate = localDate.plusWeeks(2 * i);
            System.out.println("날짜" + (i + 1) + " : " + plusDate);
        }
    }
}
