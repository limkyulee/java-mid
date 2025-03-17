package exception.example4;

public class NetworkServiceV4 {
//  복잡한 클라이언트 로직 작성.
    public void sendMessage(String message){
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(message);

//      REFACTOR :
//        > 가정 : NetworkServiceV4 는 발생하는 예외인 ConnectExceptionV4, SendExceptionV4 를 잡아도 해당 오류들을 복구할 수 없음.
//        > 결론 : 예외를 밖으로 던짐. (RuntimeException | throws 를 사용하지 않음.)
        try {
//          정상 흐름
            client.connect();
            client.send(message);
        } finally {
            client.disconnect();
        }
    }
}
