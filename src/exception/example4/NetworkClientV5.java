package exception.example4;

import exception.example4.exception.ConnectExceptionV4;
import exception.example4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable{
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect(){
//      서버 연결 실패
        if(connectError){
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data){
//      데이터 전송 실패
        if(sendError){
            throw new SendExceptionV4(data, address + " 서버 데이터 전송 실패 : " + data);
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

    /**
     * close()
     * AutoCloseable 인터페이스가 제공하는 메서드
     * try 가 끝나면 자동으로 호출됨.
     * 종료 시점에 자원을 반납하는 방법을 여기에 정의하면 됨.
     * 해당 메서드는 예외는 던지지 않음으로 throws Exception 은 작성하지 않아도 됨.

     * 장점 : 리소스 누수 방지 | 모든 리소스가 제대로 닫히도록 보장됨. finally 를 놓칠 수 있는 부분 방지.
     *     : 코드 간결성 향상 | 명시적인 close() 호출이 필요 없음.
     *     : 조금 더 빠른 자원 해제
     *     : 스코프 범위 한정 | try 블록 안으로 제한.
     */
    @Override
    public void close(){
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}
