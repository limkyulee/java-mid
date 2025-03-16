package exception.example1;

//  네트워크 관련 기능을 제공.
public class NetworkClientV1 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect(){
//      서버 연결 실패
        if(connectError){
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }

//      서버 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data){

//      데이터 전송 실패
        if(sendError){
            System.out.println(address + " 서버 데이터 전송 실패 : " + data);
            return "sendError";
        }
//      데이터 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
        return "success";
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
