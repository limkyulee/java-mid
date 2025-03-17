package exception.example4;

import exception.example4.exception.NetworkClientExceptionV4;
import exception.example4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) throws NetworkClientExceptionV4 {

//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();

            if(input.equals("exit")){
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }

            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

//  공통 예외 처리
    private static void exceptionHandler(Exception e) {
//      공통 처리
        System.out.println("사용자 메세지 : 죄송합니다. 알 수 없는 문제가 발생하였습니다.");
        System.out.println("== 개발자용 디버깅 메세지 ==");
        e.printStackTrace(System.out);

//      PLUS : 아래처럼 출력하면 빨간 기본 에러 문구 형식으로 출력함. | 일반적으로 이 방법 사용.
//        > 실무에서는 이렇게 사용하지않고,
//          별도의 로그 라이브러리를 사용해서 콘솔과 특정 파일에 함께 결과를 출력함.
//      e.printStackTrace()

//      필요하면 예외 별로 별도의 추가 처리 가능
        if(e instanceof SendExceptionV4 sendException){
            System.out.println("[전송 오류] 전송 데이터 : " + sendException.getSendData());
        }
    }
}
