package exception.example1;

public class NetworkServiceV1_1 {
//  복잡한 클라이언트 로직 작성.
    public void sendMessage(String message) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(message);

        client.connect();
        client.send(message);
        client.disconnect();
    }
}
