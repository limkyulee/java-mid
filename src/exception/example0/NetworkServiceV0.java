package exception.example0;

public class NetworkServiceV0 {
//  복잡한 클라이언트 로직 작성.
    public void sendMessage(String message) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(message);
        client.disconnect();
    }
}
