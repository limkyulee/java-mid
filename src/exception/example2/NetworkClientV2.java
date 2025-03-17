package exception.example2;

//  네트워크 관련 기능을 제공.
public class NetworkClientV2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
//      서버 연결 실패
        if(connectError){
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }

//      REFACTOR : 반환 값을 사용하지 않도록 로직 수정.
//        > 메서드 호출 후 문제 없을 경우 서버 연결 성공.
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2{
//      데이터 전송 실패
        if(sendError){
            throw new NetworkClientExceptionV2("sendError", address + " 서버 데이터 전송 실패 : " + data);
//            중간에 다른 예외가 발생했다고 가정. (Unchecked 예외)
//            throw new RuntimeException("ex");
        }

//      데이터 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해체");
    }

    public void initError(String data){
        if(data.contains("error1")){
            connectError = true;
        }

        if(data.contains("error2")){
            sendError = true;
        }
    }
}
