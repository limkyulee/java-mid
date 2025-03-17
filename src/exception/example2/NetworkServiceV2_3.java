package exception.example2;

public class NetworkServiceV2_3 {
//  복잡한 클라이언트 로직 작성.
    public void sendMessage(String message){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(message);

//      REFACTOR : 정상 흐름과 예외 흐름을 명확하게 분리.
//        > 하나의 try 안에 정상 흐름을 모두 담음.
//        > 예외 부분은 catch 블럭 안에서 해결.
//        > 하지만 예외가 발생했을 경우 disconnect() 라인 자체를 호출하지 못한다는 아쉬움이 있음.
        try {
//          정상 흐름
            client.connect();
            client.send(message);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
//          예외 흐름
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
        }

    }
}
