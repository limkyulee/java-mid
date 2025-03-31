package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Deque (Double Ended Queue)
 * 양쪽 끝에서 요소를 추가하거나 제거할 수 있음.
 * 큐와 스택 기능을 모두 포함하고 있어 매우 유연한 자료 구조.

 * ArrayDeque vs LinkedList
 * ArrayDeque 가 모든 면에서 더 빠름.
 * ArrayList(배열) 와 LinkedList(동적 노드 링크) 를 사용하는 차이와 비슷함.
 * ArrayDeque 는 특별한 원형 큐 자료구조를 사용 > 앞, 뒤 입력 모두 O(1) 의 성능을 제공. (LinkedList 도 O(1) 성능 동일 제공)
 */
public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

//      데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

//      다음 꺼낼 데이터 확인 (꺼내지 않고 단순 조회)
        System.out.println("deque.peekFirst() : " + deque.peekFirst());
        System.out.println("deque.peekLast() : " + deque.peekLast());

//      데이터 꺼내기
        System.out.println("deque.pollFirst() : " + deque.pollFirst());
        System.out.println("deque.pollFirst() : " + deque.pollFirst());
        System.out.println("deque.pollLast() : " + deque.pollLast());
        System.out.println("deque.pollLast() : " + deque.pollLast());

        System.out.println("deque : " + deque);
    }
}
