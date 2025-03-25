package collection.list;

import java.util.Arrays;

//  FIXME : 리스트 추상화 (MyArrayList 는 MyList 에 의존 | 의존관계)
public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E o) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = o;
        size++;
    }

    @Override
    public void add(int index, E o) {
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = o;
        size++;
    }

    private void shiftRightFrom(int index) {
        for(int i = size; i > index; i--){
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E o) {
        E old = get(index);
        elementData[index] = o;

        return old;
    }

    @Override
    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;

        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for(int i = index; i < size - 1; i++){
            elementData[i] = elementData[i + 1];
        }
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        return Arrays.toString(
                Arrays.copyOf(elementData, size)) +
                " size : " +
                size +
                " capacity : " + elementData.length;
    }
}
