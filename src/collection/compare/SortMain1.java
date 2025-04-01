package collection.compare;

import java.util.Arrays;

//  PLUS : Arrays.sort() | 사용 시, 기본 정렬을 시도함.
//                  이 때 객체가 스스로 가지고 있는 Comparable 인터페이스를 사용하여 비교함.
public class SortMain1 {
    public static void main(String[] args) {
        Integer[] array = {3,2,1};
        System.out.println(Arrays.toString(array));

        System.out.println("기본 정렬 후");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
