package time.supported;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

//  극북 : isSupported()
//      > 해당 "날짜 및 시간" 정보를 조회할 수 있는지 확인할 수 있는 메서드 제공.
//      > 조회가 가능할 경우에만 조회하도록 로직 수정.
public class IsSupportedMain2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        if(supported) {
            int second = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("second : " + second);
        }
    }
}
