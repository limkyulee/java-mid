package collection.array;

import java.util.Arrays;

//  LIMIT : 배열의 한계
//    > 배열의 크기를 배열을 생성하는 시점에 미리 정해야 함.
//  Q | 배열처럼 처음부터 정저긍로 길이가 정해져있는 것이 아니라, 동적으로 언제든지 길이를 조정할 수 있는 자료구조가 있을까?
//  A | "List 자료구조"
public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

//      PLUS : 배열의 첫번쨰 위치에 추가
//        > 기본 배열의 데이터를 한 칸씩 밀고 배열의 첫번째 위치에 추가함.
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

//      index 위치에 추가
//      기본 배열의 데이터를 한 칸씩 뒤로 말고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length - 1] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0; i--) {
//          다음 값에 전 값 대입 (값을 오른쪽으로 한 칸씩 이동)
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }
}
