package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

//  PLUS : OffsetDateTIme => 타임존 X, UTC 로 부터의 시간대 차이만 제공
public class OffsetDateTimeMain {
    public static void main(String[] args) {

        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt : " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2002,7,16,10,10,10);
        System.out.println("ldt : " + ldt);

        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.ofHours(1));
        System.out.println("odt : " + odt);
    }
}
