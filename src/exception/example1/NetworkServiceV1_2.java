package exception.example1;

public class NetworkServiceV1_2 {
//  REFACTOR : 네트워크 오류 발생 예외 처리 로직 추가.
    public void sendMessage(String message) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(message);

        String connectResult = client.connect();
        if(isError(connectResult)) {
            System.out.println("[네트워크 오류 발생]오류 코드 : " + connectResult);

            return;
        }

        String sendResult = client.send(message);
        if(isError(sendResult)) {
            System.out.println("[네트워크 오류 발생]오류 코드 : " + sendResult);

            return;
        }
        client.disconnect();
    }

//  REFACTOR : 복잡한 중복 로직을 메서드로 분리.
    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
