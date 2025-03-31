package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

// FIXME : Deque 를 사용하여 Stack 처럼 사용하기.
//    > push() : 스택을 위함 데이터 추가 함수.
//    > pop() : 스택을 위한 데이터 꺼내는 함수.
public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

//      데이터 추가.
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

//      다음 꺼낼 데이터 확인 (꺼내지 않고 단순 확인)
        System.out.println("deque.peek() : " + deque.peek());

//      데이터 꺼내기
        System.out.println("deque.pop() : " + deque.pop());
        System.out.println("deque.pop() : " + deque.pop());
        System.out.println("deque.pop() : " + deque.pop());
        System.out.println("deque : " + deque);
    }
}
