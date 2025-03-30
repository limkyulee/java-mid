package collection.set;

import java.util.Arrays;

//  FIXME : 해시 알고리즘 - 나머지 연산
//    > 메모리 공간 낭비를 줄이기 위해, 나머지 연산을 사용.
//    > 공간을 절약하고 넓은 범위의 값을 사용할 수 있음.
//    > Capacity 가 10 이라고 가정했을 때
//      ex) 1 % 10 = 1
//          2 % 10 = 2
//          5 % 10 = 5
//          8 % 10 = 8
//          14 % 10 = 4
//          99 % 10 = 9
//    IF : 해시 인덱스의 값이 중복이 될 경우가 생길 수 있지않을까?
//     ex) 99 % 9 == 9 % 9
//    LIMIT : 해시 인덱스 사용 시, 해시 충돌 발생 가능성 발생.
public class HashStart4 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
//      입력 : 1,2,5.8,14,99
        System.out.println("hashIndex(1) : " + hashIndex(1));
        System.out.println("hashIndex(2) : " + hashIndex(2));
        System.out.println("hashIndex(5) : " + hashIndex(5));
        System.out.println("hashIndex(8) : " + hashIndex(8));
        System.out.println("hashIndex(14) : " + hashIndex(14));
        System.out.println("hashIndex(99) : " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("Arrays.toString(inputArray) : " + Arrays.toString(inputArray));

        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("hashIndex : " + hashIndex);

//      해시 인덱스를 구하고, 배열에 해시 인덱스를 대입하여 값을 조회
        Integer result = inputArray[hashIndex]; // O(1)
        System.out.println("result : " + result);
    }

//  구해진 해시 인덱스의 위치에 데이터를 저장
    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

//  해시 인덱스를 반환
    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
