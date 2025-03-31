package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

// FIXME : Deque 를 사용하여 Queue 처럼 사용하기.
//    > offer() : 스택을 위함 데이터 추가 함수.
//    > poll() : 스택을 위한 데이터 꺼내는 함수.
public class DequeQueueMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

//      데이터 추가.
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

//      다음 꺼낼 데이터 확인 (꺼내지 않고 단순 확인)
        System.out.println("deque.peek() : " + deque.peek());

//      데이터 꺼내기
        System.out.println("deque.poll() : " + deque.poll());
        System.out.println("deque.poll() : " + deque.poll());
        System.out.println("deque.poll() : " + deque.poll());
        System.out.println("deque : " + deque);
    }
}
