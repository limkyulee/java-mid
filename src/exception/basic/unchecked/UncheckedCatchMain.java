package exception.basic.unchecked;

// PLUS : 체크 예외와 실행 결과는 동일하다.
public class UncheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
