package nested.nested.example2;

public class Network {
    public void sendMessage(String message) {
        NetworkMessage networkMessage = new NetworkMessage(message);
        networkMessage.print();
    }

//  PLUS : 중첩 클래스 (내부 클래스 포함)
//    > 자신이 소속된 바깥 클래스 안에서 사용되는 것을 목적으로 함.
//    > 따라서 자신이 소속된 바깥 클래스가 아닌 외부에서 생성하여 사용하고 있다면,
//    > 중첩 클래스의 용도와 맞지 않을 수 있음을 주의해야함

//  REFACTOR : NetworkMessage
//    > 중첩 클래스에 private 생성자
//    > Network 내부에서만 사용하는 클래스임을 인지할 수 있음.

//  Network 클래스 중첩 클래스.
    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print(){
            System.out.println("Content: " + content);
        }
    }
}
