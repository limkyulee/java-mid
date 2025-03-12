package time.supported;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

//  한계 :
//      > LocalDate 는 날짜 정보만 가지고 있음
//      > "시간" 에 대한 정보를 조회하려고 할 때 오류 발생.
public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int second = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("second : " + second);
    }
}
