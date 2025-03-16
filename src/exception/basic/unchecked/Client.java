package exception.basic.unchecked;

// PLUS : Unchecked 예외는 Throws 를 선언해주지 않아도 된다.
//  > 생략하면 알아서 터진 예외가 상위로 올라간다.
public class Client {
    public void call(){
        throw new MyUncheckedException("ex");
    }
}
