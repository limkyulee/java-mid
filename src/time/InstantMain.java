package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {

//      생성
        Instant now = Instant.now(); // UTC 기준
        System.out.println("now : " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from : " + from);

//      ofEpochSecond() : (1970.1.1.00:00:00 + 파라미터 초) 값 출력.
        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart : " + epochStart);

//      계산
//      > 초 단위의 간단한 연산만 가능.
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later : " + later);

//      조회
//      getEpochSecond() : 1970.1.1.00:00:00 부터 지정 시간까지 흐름 시간 출력.
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond : " + laterEpochSecond);
    }
}
