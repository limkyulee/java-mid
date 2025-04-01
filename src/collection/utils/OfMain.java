package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * [생성하고자하는 컬렉션].of()
 * ex) List.of(), Set.of(), Map.of()
 * 해당 기능을 사용하여 컬렉션을 생성하면 편리하고 간단하게 컬렉션을 생성할 수 있음.
 * 하지만, 가변이 아니라 불변 컬렉션을 생성하기 때문에 값을 변경할 수 없음.
 */

public class OfMain {
    public static void main(String[] args) {
//      편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list : " + list);
        System.out.println("set : " + set);
        System.out.println("map : " + map);
        System.out.println("list class : " + list.getClass()); // ImmutableCollections$ListN

//        LIMIT : 가변이 아닌 불변 컬렉션을 생성하였기 때문에 변경 메서드를 호출할 수 없음. 예외 발생.
//           > java.lang.UnsupportedOperationException
//        list.add(4);

    }
}
