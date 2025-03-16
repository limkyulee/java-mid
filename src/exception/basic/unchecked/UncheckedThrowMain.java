package exception.basic.unchecked;

//  FIXME : 체크 예외 발생 코드.
public class UncheckedThrowMain {
//  PLUS : 체크 예외와 실행 결과는 동일하다.
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}
