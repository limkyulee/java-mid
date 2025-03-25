package collection.list;

/**
 * Dependency Injection (DI)
 * 의존관계 주입
 */

//  REFACTOR : LinkedList 를 사용하여 배열 첫 번째 자리에 값 추가에 대한 성능 개선.
public class BatchProcessorMain {
    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>(); // O(n) 2631ms
//        MyLinkedList<Integer> list = new MyLinkedList<>(); // O(1) 4ms

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}
