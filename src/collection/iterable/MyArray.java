package collection.iterable;

import java.util.Iterator;

// implements Iterable<> : 인터페이스
//    > 자료구조에 사용할 반복자(Iterator) 를 반환하면 됨.
//    > 순회의 대상이 되는 자료 구조로 만들 수 있음. (반복할 수 있음을 의미)
public class MyArray implements Iterable<Integer> {

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

//  PLUS : 반복자를 반환.
    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
