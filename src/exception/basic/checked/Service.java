package exception.basic.checked;

/**
 * Checked 예외
 *  > 예외를 잡아서 처리하거나, 던지거나 둘 중 하나는 필수로 선택해야함.
 */
public class Service {
    Client client = new Client();

    /**
     * 에외를 잡아서 처리하는 코드
     */
    public void callCatch(){
        try{
            client.call();
        }catch(MyCheckedException e) {
//          getMessage() : 보관한 메세지를 꺼냄.
            System.out.println("예외 처리, message : " + e.getMessage());
        }

        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     *  > 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외의 메서드에 필수로 선언해야함.
     */
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}