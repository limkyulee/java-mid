package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//  Q : 여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력하라.
//    : 데이터의 값 순서로 출력하라. ex) 10,20,30
public class UniqueNameTest3 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(List.of(30,20,20,10,10));
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
