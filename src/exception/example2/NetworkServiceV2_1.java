package exception.example2;

public class NetworkServiceV2_1{
//  복잡한 클라이언트 로직 작성.
    public void sendMessage(String message) throws NetworkClientExceptionV2{
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(message);

        client.connect();
        client.send(message);
        client.disconnect();
    }
}
