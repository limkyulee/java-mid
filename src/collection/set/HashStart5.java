package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

//  FIXME : 해시 알고리즘 - 해시 충돌
//    > 해시 충돌이 일어날 수 있음을 인정하고 그 확률은 낮다고 가정함.
//    > 해시 충돌이 일어났을 때, 같은 해시 인덱스의 값을 같은 인덱스에 함께 저장함.
//    > 배열 안에 배열(또는 리스트 같은 다른 자료구조)을 생성.
//    IF : 같은 해시 인덱스를 띄는 값이 연속적으로 들어온다면?
//     ex) 9,19,29,99 를 저장
//       > 데이터를 찾을 때 저장한 데이터의 수 만큼 값을 비교해야함. (최악)
//       > 성능 O(n)
//    LIMIT : 최악의 경우 O(n) 의 성능을 보임. (잘 일어나지않음)
//      > 하지만 통계적으로 입력한 데이터의 수가 배열의 크기를 75% 넘지 않으면
//        해시 인덱스는 자주 충돌하지 않음.

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
//      입력 : 1,2,5.8,14,99
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];

        for(int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println("buckets : " + Arrays.toString(buckets));

        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("contains : " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
//      같은 값 중복 체크 (Set 은 중복을 허용하지 않음)
        if(!bucket.contains(value)) { // O(n)
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }

//  해시 인덱스를 반환
    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
