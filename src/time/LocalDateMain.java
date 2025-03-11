package time;

import java.time.LocalDate;

public class LocalDateMain {
//  PLUS : 모든 날짜 클래스는 불볍 객체.
//    > 즉, 변경이 필요한 경우 새로운 객체를 생성해서 반환하므로 반환값을 꼭 받아야함.
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2002, 7, 16);

        System.out.println("오늘 날짜 : " + nowDate);
        System.out.println("지정 날짜 : " + ofDate);

//       계산(불변)
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜 +10d : " + plusDays);
    }
}
