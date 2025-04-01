package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1,2,3,4});

        Iterator<Integer> iterator = myArray.iterator();

        System.out.println("iterator 사용");

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value : " + value);
        }

//      PLUS : for-each 문 (향상된 for 문)
//        > 자료 구조를 순회하는 것을 목적으로 함.
//        > 자바는 Iterable 인터페이스를 구현한 객체에 대해서 for-each 문을 사용할 수 있게 함.
//        > 컴파일러는 아래 코드를 컴파일 시점에 위 while 문과 같이 변경함.

//      LIMIT : Iterable 미 구현 후 실행 시, 아래 에러 발생. (for-each 를 사용하기 위해서는 iterable 이 구현되어있거나, 배열이어야함.)
//        > java: for-each not applicable to expression type
//                required: array or java.lang.Iterable
//                found:    collection.iterable.MyArray
        System.out.println("for-each 사용");
        for (Integer value : myArray) {
            System.out.println("value : " + value);
        }
    }
}
