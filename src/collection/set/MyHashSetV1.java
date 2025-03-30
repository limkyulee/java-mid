package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 해시 알고리즘을 사용하여 Set 자료구조 구현
 * Set 은 중복을 허용하지 않고, 순서를 보장하지 않는 자료구조.
 * [Set 의 구현 - 저장하려는 값(깂 % capacity)을 해시 인덱스로 사용]
 * 1. 인덱스가 없기 때문에 단순히 데이터를 저장.
 * 2. 데이터가 있는지 확인 후 데이터 삭제.
 * 3. 중복을 허용하지 않기 위해 데이터 추가 시, 중복 여부 체크.
 */

//  LIMIT : 문자열 해시 코드
//    > 해시 인덱스를 구할 때, 숫자를 기분으로 해시 인덱스를 구함.
//    > 해시 인덱스는 배열의 인덱스로 사용해야하므로 숫자(정수)만 사용할 수 있음.
//    > 문자 데이터를 기반으로 숫자 해시 인덱스를 구하려면?

//   FIXME: : Integer 숫자만 저장할 수 있는 Set 구현.
public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBucket();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBucket();
    }

    private void initBucket() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int key) {
        int hashIndex = hashIndex(key);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if(bucket.contains(key)) { // O(n) 이지만 평균적으로 O(1)
            return false;
        }

        bucket.add(key);
        size++;

        return true;
    }

    public boolean contains(int searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)

        return bucket.contains(searchValue); // O(n) 이지만 평균적으로 O(1)
    }

    public boolean remove(int searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
//      PLUS : Integer.valueOf(searchValue)
//        > LinkedList 는 숫자를 넘기게되면 인덱스 위치를 찾아 값을 지움.
//        > 때문에, Object 를 넘겨 (Wrapper 로 감싸)
//        > LinkedList 안에 있는 값을 기준으로 같은 것을 찾아 지우도록 함.

//      O(n) 이지만 평균적으로 O(1)
        boolean result = bucket.remove(Integer.valueOf(searchValue));

        if(result) {
            size--;
            return true;
        }else {
            return false;
        }
    }

    private int hashIndex(int key) {
        return key % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
