package time.formatting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
//      기본 LocalDateTime format : yyyy-MM-ddTHH:mm:ss
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        System.out.println("now : " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

//      FIXME : 포맷팅 : 날짜와 시간을 문자로
        String formattedDateTime = now.format(formatter);
        System.out.println("formattedDateTime : " + formattedDateTime);

//      FIXME : 파싱 : 문자를 날짜와 시간으로
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);

        System.out.println("parsedDateTime : " + parsedDateTime);
    }
}
