package exception.example1;

public class NetworkServiceV1_3 {
//  REFACTOR : disconnect() 를 반드시 호출하도록 로직 수정.
//    > JVM 메모리에 있는 인스턴스는 자동으로 해제 가능.
//    > 외부 연결과 같은 외부 자원은 자동으로 해체 불가능.
//    > 외부 자원을 사용한 후에는 연결 해체 후 반드시 반납해야함.
    public void sendMessage(String message) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(message);

//      PLUS : 반환값을 사용하여 예외 상황을 처리하는 것은
//      정상 흐름과 예외 흐름을 구분하는 것이 어려움.
        String connectResult = client.connect();
        if(isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        }else {
            String sendResult = client.send(message);
            if(isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            }
        }


        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
