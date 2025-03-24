package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
//      노드 생성하고 연결하기 A => B => C
        Node first = new Node("A"); // X01
        first.next = new Node("B"); // X02
        first.next.next = new Node("C"); // X03

        System.out.println(first);

//      모든 노드 탐색하기
        printAll(first);

//      마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("Last Node : " + lastNode);

//      특정 index 의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("Index2Node : " + index2Node.item);

//      데이터 추가하기
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }

    private static void add(Node first, String param) {
        Node lastNode = getLastNode(first);
        lastNode.next = new Node(param);
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }

        return x;
    }
}
