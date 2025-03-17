package exception.example4;

public class NetworkServiceV5 {
//  복잡한 클라이언트 로직 작성.
    public void sendMessage(String message){
        String address = "http://example.com";

//      REFACTOR : Try with resources 로직 적용.
//        > try 괄호 안에 사용할 자원을 명시함.
//        > try 블럭이 빠져나가는 순간 자동으로 AutoCloseable.close() 를 호출하여 자원을 해체함.
//        > 그 후, catch, finally 문 실행.
//        > catch 구문 없이 try 구문만 있어도 close() 는 호출됨.
        try (NetworkClientV5 client = new NetworkClientV5(address)){
//          정상 흐름
            client.initError(message);
            client.connect();
            client.send(message);
        } catch (Exception e) {
            System.out.println("[예외 확인] : " + e.getMessage());
            throw e;
        }
    }
}
