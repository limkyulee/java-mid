package exception.basic.unchecked;

/**
 * UnChecked 예외
 *  > 예외를 잡거나, 던지지 않아도 된다.
 *  > 예외를 잡지 않으면 자동으로 밖으로 던진다.
 */
public class Service {
    Client client = new Client();

    /**
     * 필요한 경우에 예외를 잡아서 처리하면 된다.
     */
    public void callCatch(){
        try{
            client.call();
        }catch (MyUncheckedException e){
//          예외 처리 로직
            System.out.println("예외 처리, message : " + e.getMessage());
        }

        System.out.println("정상 로직");
    }

    /**
     * 예외를 잡지 않아도 자연스럽게 상위로 넘어감.
     *  > 체크 예외와 다르게 throws 예외 선언을 하지 않아도 된다.
     *  > 컴파일러가 이런 부분을 체크하지 않기 때문에 언체크 예외이다.
     */
    public void callThrow(){
        client.call();
    }
}
