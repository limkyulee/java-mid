package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//  Q : 두 숫자의 집합이 제공된다.
//    : 집합1 | 1,2,3,4,5
//    : 집합2 | 3,4,5,6,7
//    : 두 집합의 합집합, 교집합, 차집합을 구해라. 출력 순서는 관계 없다.
//    : Set 인터페이스의 주요 메서드를 참고하라.
public class SetOperationTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("합집합 : " + union);
        System.out.println("교집합 : " + intersection);
        System.out.println("차집합 : " + difference);
    }
}
