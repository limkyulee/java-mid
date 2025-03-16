package exception.basic.checked;

//  FIXME : 체크 예외 발생 코드.
public class CheckedThrowMain {
//  MyCheckedException 말고 Exception 을 던지도록 선언할 수 있음.
//    > 부모 타입을 잡으면 자식 타입까지 인식할 수 있음.
    public static void main(String[] args) throws MyCheckedException {
//      예외를 처리하지않고 밖으로 던짐 | 아래 흐름을 따름.
//        > 1. main() => service.callThrow() => client.call() [예외 발생, 던짐]
//        > 2. main() <= service.callThrow() [예외 던짐] <= client.call()
//        > 3. main() [예외 던짐] <= service.callThrow() <= client.call()
        Service service = new Service();
//      예외가 main() 밖으로 던져짐.
//        > 예외 정보와 Stack Trace 를 출력하고 프로그램 종료.
        service.callThrow();

//      해당 로직을 실행하지 못하고 종료됨. | 출력되지않음.
        System.out.println("정상 종료");
    }
}
