package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

//  FIXME : 제네릭과 인터페이스를 사용한 Set 구현.
public class MyHashSetV3<E> implements MySet<E>{
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBucket();
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBucket();
    }

    private void initBucket() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E key) {
        int hashIndex = hashIndex(key);
        LinkedList<E> bucket = buckets[hashIndex]; // O(1)
        if(bucket.contains(key)) { // O(n) 이지만 평균적으로 O(1)
            return false;
        }

        bucket.add(key);
        size++;

        return true;
    }

    public boolean contains(E searchValue){
        int hashIndex = hashIndex(searchValue); // O(1)
        LinkedList<E> bucket = buckets[hashIndex]; // O(1)

        return bucket.contains(searchValue); // O(n) 이지만 평균적으로 O(1)
    }

    public boolean remove(E searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex]; // O(1)

//      O(n) 이지만 평균적으로 O(1)
        boolean result = bucket.remove(searchValue);

        if(result) {
            size--;
            return true;
        }else {
            return false;
        }
    }

    private int hashIndex(E key) {
//      PLUS : 음수가 나올 경우 배열의 index 값으로 사용할 수 없음.
        int hashCode = key.hashCode();
//      Math.abs : 절대값 반환 (음수 제거)
        return  Math.abs(hashCode) % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
