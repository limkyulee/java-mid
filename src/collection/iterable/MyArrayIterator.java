package collection.iterable;

import java.util.Iterator;

/**
 * Iterator 의 구현체 만들기
 * 생성자를 통해 반복자가 사용할 배열을 참조함. 해당 참조 배열을 순회.
 * currentIndex : 현재 인덱스, next() 를 호출할 때마다 하나씩 증가.
 *              : 인덱스는 0부터 시작하기 때문에 초기값으로 -1을 가짐.
 * hasNext() : 다음 항목이 있는지 검사. 배열의 끝에 다다르면 순회 종료 및 false 반환.
 * next() : 다음 항목 반환 및 currentIndex 하나 증가.
 */

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}
