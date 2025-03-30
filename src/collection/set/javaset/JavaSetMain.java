package collection.set.javaset;

import java.util.*;

//  FIXME : java 가 제공하는 Set.

/**
 * HashSet 과 최적화
 * 해시 기반 자료 구조를 사용하는 경우 통계적으로 데이터의 수가 배열의 크기를 75% 정도 넘어가면
 * 해시 인덱스가 자주 충돌함. (성능 저하)
 * 자바의 HashSet 은 데이터의 양이 배열의 크기의 75% 를 넘어가면
 * 배열의 크기를 2배로 늘림.
 * 2배 늘어난 크기를 기분으로 재해싱(늘어난 크기를 기준으로 모든 요소의 해시 인덱스를 다시 적용)을 진행함.
 * 자바 HashSet 의 기본 크기는 16.
 * 이 과정을 통해 인덱스 충돌 가능성을 줄임.
 */

public class JavaSetMain {
    public static void main(String[] args) {
//      무작위 순서로 정렬. A1B2C, O(1)
        run(new HashSet<>());
//      입력한 순서를 기준으로 정렬. CBA12, O(1)
        run(new LinkedHashSet<>());
//      데이터 값을 기준(데이터 순서)으로 정렬 12ABC, O(log n)
        run(new TreeSet<>());
    }

    private static void run(Set<String> set){
        System.out.println("set : " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

//      PLUS : Iterator : 컬렉션을 반복해서 출력 가능.
//           : iterator.hasNext() : 다음 데이터가 있는지 확인.
//           : iterator.next() : 다음 데이터를 반환.
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
