package collection.set.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//  Q : 여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력하라.
//    : 단, 입력 순서대로 출력하라. ex) 30,20,10
public class UniqueNameTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};

//        FIXME : 배열을 반복하여 Set 에 값을 입력하는 방법.
//        Set<Integer> set = new LinkedHashSet<>();
//        for (Integer i : inputArr) {
//            set.add(i);
//        }

//      FIXME : Set 구현체의 생성자에 배열은 전달할 수 없지만 List 는 전달 가능. (배열을 List 로 변환)
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
