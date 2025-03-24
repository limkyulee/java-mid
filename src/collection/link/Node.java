package collection.link;

/**
 * PLUS : Node(노드)
 *  > 노드는 내부에 데이터와 노드에 대한 참조를 가지고 있음.
 *  > 각각의 노드가 참조를 통해 연결되어 있음.
 *  > 데이터를 추가할 때 필요한 만큼의 노드만 만들어서 연결함.
 *      > 따라서 배열과 다르게 메모리를 낭비하지 않음.
 *      > 물론 next 필드를 통해 참조값을 보관하기 때문에, 추가적인 메모리 낭비도 발생함.
 */
public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

//    IDE 생성 toString()
/*
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
*/

    // [A->B->C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this; // x01
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if(x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
