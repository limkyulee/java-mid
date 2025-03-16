package exception.basic.checked;

/**
 * Exception 을 상속받은 에외는 체크 예외가 된다.
 *  > 예외 클래스를 만들려면 예외를 상속 받으면 됨.
 */
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {

//      PLUS : super(message) 로 전달한 메세지는 Throwable 에 있는 detailMessage 에 보관됨.
        super(message);
    }
}
