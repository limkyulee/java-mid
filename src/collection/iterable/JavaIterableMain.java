package collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 자바가 제공하는 Iterable, Iterator
 * 자바 collection 프레임워크는 ArrayList, LinkedList, HashSet, TreeSet 등 다양한 자료구조를 제공함.
 * collection 인터페이스 상위에 Iterator 인터페이스 존재.
 * 때문에, 모든 컬렉션은 Iterable 인터페이스와 각 구현체에 맞는 Iterator 를 사용하여
 * 일관된 방법으로 자료구조를 순회할 수 있음을 의미.

 * 다만,
 * Map 의 경우 Key-Value 의 형태를 띄기 때문에 직접적인 순회는 불가함.
 * 1. Key, Value 를 정하여 순회 가능. (keySet(), values() 는 Set, Collection 을 반환)
 * 2. Entry 를 Set 구조로 반환하여 순회 가능. (entrySet())
 */

/**
 * Iterator (반복자) 디자인 패턴
 * 객체지향 프로그래밍에서 컬렉션의 요소들을 순회할 때 사용되는 디자인 패턴.
 * 컬렉션 내부 표현 방식을 노출시키지 않으면서 그 안의 각 요소에 순차적으로 접근 가능.
 * 이 패턴은 컬렉션의 구현과는 독집적으로 요소를 탐색할 수 있는 방법을 제공.
 * 따라서, 코드의 복잡성을 줄이고 재사용성을 높일 수 있음.
 */

public class JavaIterableMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printAll(list.iterator());
        foreach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator());
        foreach(set);
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator : " + iterator);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void foreach(Iterable<Integer> iterable) {
        System.out.println("iterable : " + iterable);
        for(Integer i : iterable) {
            System.out.println(i);
        }
    }
}
