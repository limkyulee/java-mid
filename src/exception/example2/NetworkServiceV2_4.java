package exception.example2;

public class NetworkServiceV2_4 {
//  복잡한 클라이언트 로직 작성.
    public void sendMessage(String message){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(message);

//      REFACTOR : disconnect() 를 예외 처리가 끝난 다음에 정상 흐름의 마지막에 호출하도록 로직 수정.
//        > 오류가 발생해도 서버 연결 해지에 성공.
//        > 하지만 catch 에서 잡을 수 없는 예외가 발생할 경우 문제가 발생할 수 있음. (ex: Unchecked 예외 - RuntimeException)
//        > 만약 정상 흐름에서, throw new RuntimeException 과 같은 예상치 못한 오류 발생 시, (catch 대상이 아님)
//        > catch 에서 예외를 잡지 않고 바로 밖으로 예외를 보낸 후 프로그램 종료.
//        > 이 때는 disconnect() 를 또 호출하지 못하는 문제 발생함.
//        > 연결된 자원을 확실히 해체할 수 있는 대안이 필요. (finally)
        try {
//          정상 흐름
            client.connect();
            client.send(message);
        } catch (NetworkClientExceptionV2 e) {
//          예외 흐름
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
        }
        client.disconnect();
    }
}
