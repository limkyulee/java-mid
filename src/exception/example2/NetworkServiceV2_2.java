package exception.example2;

public class NetworkServiceV2_2 {
//  복잡한 클라이언트 로직 작성.
    public void sendMessage(String message){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(message);

//      REFACTOR : 예외가 발생할 수 있는 구간을 try catch 를 사용하여 예외 처리 하도록 수정.
//        > 예외를 잡아서 처리했기 때문에 예외가 복구 되고, 프로그램도 계속 수행할 수 있음.
//        > 하지만 정상 흐름과 예외 흐름이 섞여 있어 코드 가독성이 떨어지고
//        > disconnect() 를 실행시키지 못한다는 문제는 해결되지 않음.
        try {
//          정상 흐름
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
//          예외 흐름
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());

            return;
        }

        try {
//          정상 흐름
            client.send(message);
        } catch (NetworkClientExceptionV2 e) {
//          예외 흐름
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());

            return;
        }

        client.disconnect();
    }
}
