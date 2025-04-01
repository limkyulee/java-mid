package collection.utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Collection Utils (컬렉션 유틸)
 * max : 정렬 기준으로 최대 값을 찾아서 반환.
 * min : 정렬 기준으로 최소 값을 찾아서 반환.
 * shuffle : 컬렉션을 랜덤하게 섞음.
 * sort : 정렬 기준으로 컬렉션을 정렬.
 * reverse : 정렬 기준의 반대로 컬렉션을 정렬.
 */
public class CollectionSortMain {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);

        System.out.println("list : " + list);
        Collections.shuffle(list);
        System.out.println("Shuffled list : " + list);

        Collections.sort(list);
        System.out.println("Sorted list : " + list);

        Collections.reverse(list);
        System.out.println("Reversed list : " + list);
    }
}
