package collection.array;

import java.util.Arrays;

//  PLUS : 배열에서 인덱스(index)를 사용하면 매우 빠르게 차료를 찾을 수 있음.
//     > 인덱스를 통한 입력, 변경, 조회의 경우 한번의 계산으로 자료의 위치를 찾을 수 있음.
//     > 배열에서 인덱스를 사용하는 경우 데이터가 아무리 많아도 한 번의 연산으로 필요한 위치를 찾을 수 있음.

/**
 * 공식 : 배열의 시작 참조 + (자료의 크기 * 인덱스 위치)
 * arr[0]: x100 + (4byte * 0): x100
 * arr[1]: x100 + (4byte * 1): x104
 * arr[2]: x100 + (4byte * 2): x108
 */

// FIXME : 빅오 표기법
//    > 매우 큰 데이터를 입력한다고 가정하고, 데이터 양 증가에 따른 성능의 변화 추세를 비교하는데 사용함.
//    > 정확한 성능을 측정하는 것이 아닌 대략적인 추세를 비교하는 것을 목적으로 함 (작은 상수는 크게 의미가 없음).
//    > 빅요 표기법에서는 상수를 제거함. ex) O(n+2), O(n/2) => O(n)

public class ArrayMain1 {
    public static void main(String[] args) {

        int[] arr = new int[5];

//      index 입력 : O(1)
        System.out.println("==index 입력 : O(1)");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
//        System.out.println(arr); // 이렇게 출력 시, 참조값 반환
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 변경 : O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회 : O(1)==");
        System.out.println("arr[2] : " + arr[2]);

//      PLUS : 배열의 순차 검색
//        > 배열의 크기 만큼 연산이 필요함
//        > 배열의 크기가 n 이면 연산도 n 만큼 필요함.
//        > 평균적으로 볼 때 배열의 크기가 클 수록 오랜 시간이 걸림.
        System.out.println("==배열 검색 : O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            if(arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
    }
}
