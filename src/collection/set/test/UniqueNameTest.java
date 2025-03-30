package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//  Q : 여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력하라.
//    : 출력 순서는 관계 없다.
public class UniqueNameTest {
    public static void main(String[] args) {
        Integer[] inputArr = {20,30,30,10,10};

        Set<Integer> set = new HashSet<>();
        for (Integer i : inputArr) {
            set.add(i);
        }

        for(Integer i : set) {
            System.out.println(i);
        }
    }
}
