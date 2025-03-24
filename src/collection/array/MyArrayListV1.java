package collection.array;

import java.util.Arrays;

//  FIXME : 정적 배열 직접 구현
public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
       elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

//  리스트에 데이터 추가
//    > 데이터 추가 시, size 하나 증가.
    public void add(Object o) {
        elementData[size] = o;
        size++;
    }

//  인덱스에 있는 항목을 조회
    public Object get(int index) {
        return elementData[index];
    }

//  인덱스에 있는 항목을 교체
//    > 값을 교체하지만 예전 값을 반환.
    public Object set(int index, Object o) {
        Object old = get(index);
        elementData[index] = o;

        return old;
    }

//  검색 기능
//    > 리스트를 순차 탐색하여 인수와 같은 데이터를 찾으면 i(인덱스의 위치), 못 찾으면 -1 반환.
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

//  PLUS : Arrays.copyOf(elementData, size)
//        > size 크기의 배열을 새로 만듬.
//        > size 이후의 의미 없는 값은 미 출력.
    @Override
    public String toString(){
        return Arrays.toString(
                Arrays.copyOf(elementData, size)) +
                " size : " +
                size +
                " capacity : " + elementData.length;
    }
}

