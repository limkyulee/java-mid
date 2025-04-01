package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
//      빈 가변 리스트 생성
//      PLUS : 원하는 컬렉션의 구현체를 직접 생성하면 됨.
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

//      빈 불변 리스트 생성
//      PLUS :
//        > 1. Collections.emptyList() | 자바5 부터 제공 * 권장하지않음
//        > 2. List.of() | 자바9 부터 제공 (더 간결한 사용성을 제공 * 권장)
        List<Integer> list3 = Collections.emptyList();
        List<Integer> list4 = List.of();

        System.out.println("list3.getClass() = " + list3.getClass()); // Collections$EmptyList
        System.out.println("list4.getClass() = " + list4.getClass()); // ImmutableCollections$ListN
    }
}
