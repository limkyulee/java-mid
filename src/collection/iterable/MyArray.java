package collection.iterable;

import java.util.Iterator;

/**
 * Iterable(반복가능한)/Iterator(반복자)
 * 특정 자료구조가 Iterable, Iterator 를 구현하면,
 * 해당 자료구조를 단순히 hasNext(), next(), for-each 문을 사용하여 순회할 수 있음.
 */

public class MyArray implements Iterable<Integer> {

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

//  PLUS : 특정 자료구조가 해당 반복자를 반환.
    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
