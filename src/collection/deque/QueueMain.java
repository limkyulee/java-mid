package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

//  FIXME: Queue (FIFO, First In First Out)
public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

//      데이터 추가
//      PLUS : 큐에 값을 넣는 겂은 offer 라고 함.
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);

//      다음 꺼낼 데이터 확인 (꺼내지 않고 단순 조회)
        System.out.println("queue.peek : " + queue.peek());

//      PLUS : 큐에서 값을 꺼내는 것을 poll 이라 함.
        System.out.println("queue.poll : " + queue.poll());
        System.out.println("queue.poll : " + queue.poll());
        System.out.println("queue.poll : " + queue.poll());

        System.out.println("queue : " + queue);
    }
}
