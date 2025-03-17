package exception.example3;

import exception.example3.exception.ConnectExceptionV3;
import exception.example3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {
//  복잡한 클라이언트 로직 작성.
    public void sendMessage(String message){
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(message);

//      REFACTOR : 예외 클래스를 각각의 예외 상황에 맞추어 만든 후, 예외를 잡아서 처리하도록 로직 수정.
//         > 예외 상황에 따라 다른 로직 수행 가능.
        try {
//          정상 흐름
            client.connect();
            client.send(message);
        }catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메세지 : " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터 : " + e.getSendData() + ", 메세지 : " + e.getMessage());
        }  finally {
            client.disconnect();
        }
    }
}
