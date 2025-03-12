package nested.nested.example1;

// NetworkMain 은 오직 NetWork 클래스만 사용.
public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("Hello World");
    }
}
