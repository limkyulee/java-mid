package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

//  Q : 스택에 push() 를 통해서 다음 데이터를 순서대로 입력하라.
//    : 스택에 pop() 을 통해서 데이터를 꺼내고 꺼낸 순서대로 출력하라.
public class SimpleHistoryTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
