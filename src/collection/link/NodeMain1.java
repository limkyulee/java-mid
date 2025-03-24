package collection.link;

/**
 * 반복 실행 순서
 * 1. Node x = x01
 *   > x.item 출력 => "A"
 *   > x = x.next(x02)
 * 2. Node x = x02
 *   > x.item 출력 => "B"
 *   > x = x.next(x03)
 * 3. Node x = x03
 *   > x.item 출력 => "C"
 *   > x = x.next(null)
 * 4. Node x = null
 *   > while(x != null) 조건에서 종료
 */

public class NodeMain1 {
    public static void main(String[] args) {
//      노드 생성하고 연결하기 A => B => C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색하기");
//        System.out.println("first : " + first.item); // A
//        System.out.println("fist.next : " + first.next.item); // B
//        System.out.println("first.next.next : " + first.next.next.item); // C

//      Node x 에 fist 참조를 대입.
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
