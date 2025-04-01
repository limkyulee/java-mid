package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 불변 컬렉션과 가변 컬렉션 전환
 * new ArrayList : 불변 => 가변
 * Collections.unmodifiableList : 가변 => 불변
 */
public class ImmutableMain {
    public static void main(String[] args) {
//      불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

//      가변 리스트로 변경.
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList : " + mutableList);
        System.out.println("mutableList class : " + mutableList.getClass()); // ArrayList

//      불변 리스트로 변경.
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList class : " + unmodifiableList.getClass()); // Collections$UnmodifiableRandomAccessList
    }
}
