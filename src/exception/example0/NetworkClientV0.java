package exception.example0;

//  네트워크 관련 기능을 제공.
public class NetworkClientV0 {
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect(){
//        연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data){
//        전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
        return "success";
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해체");
    }
}
