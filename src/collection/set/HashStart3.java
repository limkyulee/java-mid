package collection.set;

import java.util.Arrays;

//  FIXME : 해시 알고리즘 - 메모리 낭비
//     IF : 입력 범위가 0~99 를 넘어 int 숫자의 모든 범위를 입력할 수 있도록 한다면?
//        > 약 42억 사이즈의 배열 필요(-+ 모두 포함)
//        > 약 17기가 바이트 필요 (걍 최악)
public class HashStart3 {
    public static void main(String[] args) {

//      입력 : 1,2,5.8,14,99
//      [null,1,2,null,null,5,null,null,8,null,,,,14,,,,99]

        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("Arrays.toString(inputArray) : " + Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue]; // O(1)
        System.out.println("result : " + result);
    }
}
