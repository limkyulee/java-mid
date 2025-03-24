package collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
//      노드 생성하고 연결하기 A => B => C
        Node first = new Node("A"); // X01
        first.next = new Node("B"); // X02
        first.next.next = new Node("C"); // X03

        System.out.println("연결된 노드 출력하기");
        System.out.println(first);


    }
}
