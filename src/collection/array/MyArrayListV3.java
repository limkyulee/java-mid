package collection.array;

import java.util.Arrays;

//  FIXME : 배열 리스트(Array List) 직접 구현
public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
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

//  리스트에 데이터 추가
//    > 데이터 추가 시, size 하나 증가.
    public void add(int index, Object o) {
//       코드 추가
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = o;
        size++;
    }

//  코드 추가
//  요소의 마지막부터 index 까지 오른쪽으로 밀기.
    private void shiftRightFrom(int index) {
        for(int i = size; i > index; i--){
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length; // X001 (기존 배열은 더이상 참조하는 것이 없음 => GC 대상)
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

//  코드 추가
    public Object remove(int index) {
        Object oldValue = get(index);
//      데이터 이동
        shiftLeftFrom(index);
        size--;
        elementData[size] = null; // 값을 복사하는 것이기 때문에 값이 남아있을 수 있어 비워줌.

        return oldValue;
    }

//  코드 추가
//  요소의 index 부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for(int i = index; i < size - 1; i++){
            elementData[i] = elementData[i + 1];
        }
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
