package exception.example2;

public class NetworkServiceV2_5 {
//  복잡한 클라이언트 로직 작성.
    public void sendMessage(String message){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(message);

//      REFACTOR : finally 를 사용하여 정상 흐름 예외 흐름과 관계 없이 무조건 실행하도록 로직 수정.
//        >  try catch 안에서 처리할 수 없는 예외가 발생했을 경우에도 finally 구문을 먼저 호출 후 예외 처리함.
        try {
//          정상 흐름
            client.connect();
            client.send(message);
        } catch (NetworkClientExceptionV2 e) {
//          예외 흐름
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
