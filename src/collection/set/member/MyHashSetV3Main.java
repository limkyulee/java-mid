package collection.set.member;

import collection.set.MyHashSetV3;
import collection.set.MySet;

//  FIXME : 제네릭을 사용하여 타입 안정성이 높은 Set 구현.
public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("set : " + set);

//      검색
        String searchValue = "A";
        boolean found = set.contains(searchValue);
        System.out.println("found : " + found);
    }
}
