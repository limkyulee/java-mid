package exception.example3;

import exception.example3.exception.ConnectExceptionV3;
import exception.example3.exception.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {
//  복잡한 클라이언트 로직 작성.
    public void sendMessage(String message){
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(message);

        try {
//          정상 흐름
            client.connect();
            client.send(message);
        }catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메세지 : " + e.getMessage());
//      PLUS : 순서대로 catch 를 하기 때문에 상위가 하위보다 위에 선언되어있을 경우 하위 예외는 잡히지 않는다.
//            > 즉, 더 디테일한 하위 예외를 먼저 catch 처리 해주어야한다.
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메세지 : " + e.getMessage());
        }catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메세지 : " +e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
