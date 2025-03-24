package collection.array;

import java.util.Arrays;

//  FIXME : 동적 배열 직접 구현
public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

//  리스트에 데이터 추가
//    > 데이터 추가 시, size 하나 증가.
    public void add(Object o) {
//       코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = o;
        size++;
    }

//  코드 추가
    private void grow() {
        int oldCapacity = elementData.length; // X001 (기존 배열은 더이상 참조하는 것이 없음 => GC 대상)

//      PLUS : 2배씩 증가하는 이유
//        > 배열을 새로 복사해서 만드는 연산은 가능한 줄이는 것이 좋음
//        > 하지만 한번에 많이 증가하면 버려지는 메모리가 발생할 수 있기 떄문에 적절하게 증가하는 것이 좋음.
//        > 실제 java 에서는 50% 정도로 증가시킴.
        int newCapacity = oldCapacity * 2; // X002
//      배열을 새로 만들고 기존 배열을 새로운 배열에 복사.
        elementData = Arrays.copyOf(elementData, newCapacity);
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
