package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// FIXME: 멀티스레드 동기화 문제 해결.
public class SyncMain {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list class : " + list.getClass());
//      PLUS : Collections.synchronizedList
//        > 일반 리스트를 멀티스레드 상황에서 동기화 문제가 발생하지 않는 안전한 리스트로 만들 수 있음.
//        > 선행 작업이 끝날 때까지 후행 작업을 기다리도록 함.
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        // Collections$SynchronizedRandomAccessList
        System.out.println("synchronizedList.getClass() : " + synchronizedList.getClass());
    }
}
