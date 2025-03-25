package collection.list;

/**
 * 시간 복잡도와 실제 성능
 * 이론적으로 MyLinkedList 의 평균 추가(중간삽입) 연산은 MyArrayList 보다 빠를 수 있다.
 * 하지만, 실제 성능은 요소의 순차적 접근 속도, 메모리 항당 및 해제 비용, CPU 캐시 활용도 등 다양한 요소에 의해 영향을 받음.

 * MyArrayList 의 경우 요소들이 메모리 상에서 연속적으로 위치 => CPU 캐시 효율이 좋고 접근 속도가 빠름.
 * MyLinkedList 의 경우 각 요소가 별도의 객체로 존재하고 next(다음) 요소의 참조를 저장하여
 * CPU 캐시 효율이 떨어지고 접근 속도가 상대적으로 느림.

 *  MyArrayList 의 경우 Capacity 를 넘어섰을 때 발생하는 배열을 다시 만들고 복사하는 과정이 추가되지만,
 *  가끔 발생하는 과정이므로, 전체 성능에 크게 영향을 주지 않음.

 *  따라서, 대부분의 경우 배열 리스트가 성능상 유리하다. (실무에서 주로 사용)
 *  만약, 데이터를 앞쪾에서 자주 추가하거나 삭제할 일이 있다면 연결 리스트를 고려하는 것도 좋다.
 */
public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;

        System.out.println("[MyArrayListPerformanceTest]");
        System.out.println("==추가==");
        addFirst(new MyArrayList<>(), size); // O(n) 2750ms
        addMiddle(new MyArrayList<>(), size); // 찾는데 O(1), 데이터 추가 후 밀기 O(n) 1210ms

        MyArrayList<Integer> arrayList = new MyArrayList<>(); // 조회용 데이터로 사용
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

        System.out.println("[MyLinkedListPerformanceTest]");
        System.out.println("==추가==");
        addFirst(new MyLinkedList<>(), size); // O(1) 2ms
        addMiddle(new MyLinkedList<>(), size); // 찾는데 O(n), 데이터 추가 O(1) 1942ms

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size); // 찾는데 O(n), 데이터 추가 O(1) 3884ms

        System.out.println("==조회==");
        getIndex(linkedList, loop, 0); // 제일 앞에 조회 O(1) 0ms
        getIndex(linkedList, loop, size / 2); // 중간 조회 O(n) 769ms
        getIndex(linkedList, loop, size - 1); // 제일 뒤에 조회 O(n) 1539ms

        System.out.println("==검색==");
        search(linkedList, loop, 0); // 제일 앞에 값 검색 O(1) 0ms
        search(linkedList, loop, size / 2); // 중간 값 검색 O(n) 856ms
        search(linkedList, loop, size - 1); // 제일 뒤에 값 검색 O(n) 1706ms
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기 : " + size + ", 계산 시간 : " + (end - start) + "ms");
    }

    private static void addMiddle(MyList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2,i);
        }
        long end = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기 : " + size + ", 계산 시간 : " + (end - start) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기 : " + size + ", 계산 시간 : " + (end - start) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long end = System.currentTimeMillis();
        System.out.println("index : "+ index + ", 반복 : " + loop + ", 계산 시간 : " +  (end - start) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long end = System.currentTimeMillis();
        System.out.println("findValue : "+ findValue + ", 반복 : " + loop + ", 계산 시간 : " +  (end - start) + "ms");
    }
}
