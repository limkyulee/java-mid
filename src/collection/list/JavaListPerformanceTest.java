package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;

        System.out.println("[ArrayListPerformanceTest]");

        System.out.println("==추가==");
        addFirst(new ArrayList<>(), size); // 고속복사를 사용하여 데이터를 뒤로 미는 과정이 빨라짐. O(n) 333ms
        addMiddle(new ArrayList<>(), size); // 찾는데 O(1), 고속복사 O(n) 178ms

        ArrayList<Integer> arrayList = new ArrayList<>(); // 조회용 데이터로 사용
        addLast(arrayList, size); // 찾는데 O(1), 데이터 추가 후 밀기 O(1) 2ms

        int loop = 10_000;
        System.out.println("==조회==");
        getIndex(arrayList, loop, 0); // 제일 앞에 조회 O(1) 1ms
        getIndex(arrayList, loop, size / 2); // 중간 조회 O(1) 1ms
        getIndex(arrayList, loop, size - 1); // 제일 뒤에 조회 O(1) 1ms

        System.out.println("==검색==");
        search(arrayList, loop, 0); // 제일 앞에 값 검색 O(1) 1ms
        search(arrayList, loop, size / 2); // 중간 값 검색 O(n) 205ms
        search(arrayList, loop, size - 1); // 제일 뒤에 값 검색 O(n) 392ms

        System.out.println("[LinkedListPerformanceTest]");

        System.out.println("==추가==");
        addFirst(new LinkedList<>(), size); // O(1) 2ms
        addMiddle(new LinkedList<>(), size); // 찾는데 O(n), 데이터 추가 O(1) 2037ms

        LinkedList<Integer> linkedList = new LinkedList<>();
        // 마지막 노드를 알고있기 때문에 뒤에서부터 찾을 수 있음 O(1), 데이터 추가 O(1) 2ms
        addLast(linkedList, size);

        System.out.println("==조회==");
        getIndex(linkedList, loop, 0); // 제일 앞에 조회 O(1) 0ms
        getIndex(linkedList, loop, size / 2); // 중간 조회 O(n) 776ms
        getIndex(linkedList, loop, size - 1); // 제일 뒤에 조회 O(1) 0ms

        System.out.println("==검색==");
        search(linkedList, loop, 0); // 제일 앞에 값 검색 O(1) 0ms
        search(linkedList, loop, size / 2); // 중간 값 검색 O(n) 866ms
        search(linkedList, loop, size - 1); // 제일 뒤에 값 검색 O(n) 1721ms
    }

    private static void addFirst(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기 : " + size + ", 계산 시간 : " + (end - start) + "ms");
    }

    private static void addMiddle(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2,i);
        }
        long end = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기 : " + size + ", 계산 시간 : " + (end - start) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기 : " + size + ", 계산 시간 : " + (end - start) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long end = System.currentTimeMillis();
        System.out.println("index : "+ index + ", 반복 : " + loop + ", 계산 시간 : " +  (end - start) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long end = System.currentTimeMillis();
        System.out.println("findValue : "+ findValue + ", 반복 : " + loop + ", 계산 시간 : " +  (end - start) + "ms");
    }
}
