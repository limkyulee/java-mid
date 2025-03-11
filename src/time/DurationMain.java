package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {

        Duration duration = Duration.ofMinutes(30);
        System.out.println("Duration : " + duration);

        LocalTime localTime = LocalTime.of(1, 0);
        System.out.println("LocalTime : " + localTime);

//      계산에 사용
        LocalTime plusTime = localTime.plus(duration);
        System.out.println("plusTime : " + plusTime);

//      시간 차이
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(10, 0);

        Duration between = Duration.between(startTime, endTime);
        System.out.println("Between second : " + between.getSeconds());
        System.out.println("시간 차이 : " + between.toHours() + "시간, 분 차이 : " + between.toMinutes() + "분");

    }
}
