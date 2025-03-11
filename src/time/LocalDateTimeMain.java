package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2002, 7, 16, 8, 10, 1);

        System.out.println("현재 날짜 시간 : " + nowDt);
        System.out.println("지정 날짜 시간 : " + ofDt);

//      날짜 시간 분리
        LocalDate localDate = nowDt.toLocalDate();
        LocalTime localTime = nowDt.toLocalTime();

        System.out.println("LocalDate : " + localDate);
        System.out.println("LocalTime : " + localTime);

//      날짜 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("LocalDateTime : " + localDateTime);

//      계산(불변)
        LocalDateTime ofDtPlusDays = ofDt.plusDays(100);
        LocalDateTime ofDtPlusYear = ofDt.plusYears(1);

        System.out.println("ofDtPlusDays : " + ofDtPlusDays);
        System.out.println("ofDtPlusYear : " + ofDtPlusYear);

//      비교
//      PLUS : isEqual() 은 단순히 시간적으로 동일할 경우 true 반환 (타임존이 달라도 시간적으로 같으면 true)
//        > ex) 서울의 9시 = UTC 0시 비교 시, true 반환.
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜 시간과 지정 날짜 시간이 같은가? " + nowDt.isEqual(ofDt));
    }
}
