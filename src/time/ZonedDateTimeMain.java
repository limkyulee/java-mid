package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// PLUS : ZoneDateTime = LocalDateTime + ZoneId
public class ZonedDateTimeMain {
    public static void main(String[] args) {

//      그냥 출력하면 system default 의 timezone 을 사용.
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt : " + nowZdt);

        LocalDateTime localDateTime = LocalDateTime.of(2002,7,16,10,17,22);
        ZonedDateTime zonedDateTime1= ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(2002,7,16,10,17,22,0, ZoneId.of("Asia/Seoul"));

        System.out.println("localDateTime : " + localDateTime);
        System.out.println("zonedDateTime1 : " + zonedDateTime1);
        System.out.println("zonedDateTime2 : " + zonedDateTime2);

//      timezone 변경
//      withZoneSameInstant : timezone 에 맞춰 시간도 변경된다.
        ZonedDateTime utcZdt = zonedDateTime2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZdt : " + utcZdt);
    }
}
