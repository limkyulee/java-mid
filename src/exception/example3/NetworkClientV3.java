package exception.example3;

import exception.example3.exception.ConnectExceptionV3;
import exception.example3.exception.SendExceptionV3;

//  REFACTOR : 예외 계층.
//    > 오류 코드로 어떤 오류가 발생했는지 이해하는 것이 아니라
//    > 예외 자체로 어떤 오류가 발생했는지 확인할 수 있음.
public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 {
//      서버 연결 실패
        if(connectError){
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3{
//      데이터 전송 실패
        if(sendError){
            throw new SendExceptionV3(data, address + " 서버 데이터 전송 실패 : " + data);
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
