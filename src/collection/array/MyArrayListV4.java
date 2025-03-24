package collection.array;

import java.util.Arrays;

/**
 * MyArrayList

 * CONS : 데이터를 중간에 추가하거나 삭제할 떄 비효율적임. | O(n)
 *      : 정확한 크기를 미리 알지 못하면 메모리가 낭비됨. (배열의 뒷 부분에 사용되지 않고, 낭비되는 메모리가 있음)
 *      Q | 이러한 단점을 해결하기 위한 방법은?
 *      A | "링크드 리스트(LinkedList)"
 * PROS : 순서대로 마지막에 데이터를 추가하거나 삭제할 때는 성능이 좋음. | O(1)
 * @param <E>
 */

//  FIXME : 제네릭의 사용 직접 구현
public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

//  PLUS : Object 배열에 데이터를 저장해야하는 이유
//      > 런타임에 타입정보가 필요한 생성자에는 제네릭을 사용할 수 없음.
    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

//  리스트에 데이터 추가
//    > 데이터 추가 시, size 하나 증가.
    public void add(E o) {
//       코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = o;
        size++;
    }

//  리스트에 데이터 추가
//    > 데이터 추가 시, size 하나 증가.
    public void add(int index, E o) {
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

//  LIMIT : 조회 시, 다운캐스팅
//      > Object 는 모든 데이터를 담을 수 있기 때문에 데이터를 담는데는 문제가 없음.
//      > 다만, 데이터를 조회할 때 문제가 될 수 있기 떄문에 다운캐스팅을 해주어야함.

//  인덱스에 있는 항목을 조회
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

//  인덱스에 있는 항목을 교체
//    > 값을 교체하지만 예전 값을 반환.
    public E set(int index, E o) {
        E old = get(index);
        elementData[index] = o;

        return old;
    }

//  코드 추가
    public E remove(int index) {
        E oldValue = get(index);
//      데이터 이동
        shiftLeftFrom(index);
        size--;
        elementData[size] = null; // 값을 복사하는 것이기 때문에 값이 남아있을 수 있어 비워줌.

        return oldValue;
    }

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
