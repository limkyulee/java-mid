package collection.set;

import java.util.Arrays;

//  FIXME : 해시 알고리즘
public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("Arrays.toString(inputArray) : " + Arrays.toString(inputArray));

        int searchValue = 8;
//      PLUS : 배열에서 검색할 값을 찾기 위해서는 배열에 들어있는 데이터를 모두 찾아서 값을 비교해야함.
//             배열에서 특정 데이터를 찾는 성능은 O(n) 으로 느림.
//             물론 데이터가 많아질수록 더 느려짐.
        for(int inputValue : inputArray) {
            if(inputValue == searchValue) {
                System.out.println(inputValue);
            }
        }
    }
}
