package exception.basic.checked;

public class CheckedCatchMain {
    public static void main(String[] args) {
//      에외를 잡아서 처리 | 아래 흐름을 따름.
//        > 1. main() => service.callCatch() => client.call() [예외발생, 던짐]
//        > 2. main() <= service.callCatch() [예외처리] <= client.call()
//        > 3. main() [정상 흐름] <= service.callCatch() <= client.call()
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
