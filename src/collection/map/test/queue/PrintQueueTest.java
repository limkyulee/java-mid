package collection.map.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

//  Q : 프린터 대기
//    : 프린터에 여러 문서의 출력을 요청하면 한번에 모든 문서를 출력할 수 없다.
//      따라서 순서대로 출력해야한다. 문서가 대기할 수 있도록 큐 구조를 사용하라.
//    : "doc1", "doc2", "doc3" 문서를 순서대로 입력하고, 입력된 순서대로 출력하라.
public class PrintQueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("doc1");
        queue.add("doc2");
        queue.add("doc3");

        System.out.println("출력 " + queue.poll());
        System.out.println("출력 " + queue.poll());
        System.out.println("출력 " + queue.poll());
    }
}
