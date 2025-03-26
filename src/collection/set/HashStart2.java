package collection.set;

import java.util.Arrays;

//  FIXME : 해시 알고리즘 - index 사용 (인덱스와 데이터 값을 동일하게 설정)
//      REFACTOR : 배열의 인덱스를 활용하여 O(n) => O(1) 로 검색 성능 향상.
//          > 물론 속도를 가져가지만 메모리 공간에 대한 낭비가 있음.
public class HashStart2 {
    public static void main(String[] args) {

//      입력 : 1,2,5.8
//      [null,1,2,null,null,5,null,null,8,null]

        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("Arrays.toString(inputArray) : " + Arrays.toString(inputArray));

        int searchValue = 8;
        Integer result = inputArray[searchValue]; // O(1)
        System.out.println("result : " + result);
    }
}
