package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalenderPrinter {
//  Q : 달력 출력하기
//    : 입력 조건 | 년, 월
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요 : ");
        int month = scanner.nextInt();

        printCalender(year, month);
    }

    public static void printCalender(int year, int month) {
        LocalDate firstDateOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDateOfNextMonth = firstDateOfMonth.plusMonths(1);

//      요일 출력.
        System.out.println("Su Mo Tu We Th Fr Sa");

//      FIXME : 정답 참고.
//      월요일(1%7 = 1) ... 일요일(7%7 = 0)
//      월 시작 날짜 요일 계산하여 offset 정도 계산. > 공백 주기
        int offsetWeekDays = firstDateOfMonth.getDayOfWeek().getValue() % 7;
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate printDay = firstDateOfMonth;

        while (printDay.isBefore(firstDateOfNextMonth)) {
            System.out.printf("%2d ", printDay.getDayOfMonth());

//          토요일일 경우 다음 줄로 출력.
            if(printDay.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }

//          날짜 증가.
            printDay = printDay.plusDays(1);
        }
    }
}
