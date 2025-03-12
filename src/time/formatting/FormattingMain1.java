package time.formatting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// PLUS : 패턴 참고 공식 사이트
// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#patterns
public class FormattingMain1 {
    public static void main(String[] args) {

//      기본 LocalDate format : yyyy-MM-dd
        LocalDate date = LocalDate.of(2024,12, 12);
        System.out.println("date : " + date);

//      FIXME : 포멧팅 : 날짜를 문자로 포멧팅
//      DateTimeFormatter : LocalDate 와 같은 날짜 객체를 원하는 형태의 문자로 변경할 수 있음.
//        > ofPattern() : 원하는 포멧을 지정하여 사용 가능.
//        > format() : 원하는 포멧으로 포멧팅 가능.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = date.format(formatter);

        System.out.println("formattedDate : " + formattedDate);

//      FIXME : 파싱 : 문자를 날짜로 파싱
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String input = "2025년 07월 16일";

//      parse() : 지정한 포멧이 맞는 문자를 날짜로 파싱 가능.
        LocalDate parsedDate = LocalDate.parse(input, formatter2);
        System.out.println("parsedDate : " + parsedDate);
    }
}