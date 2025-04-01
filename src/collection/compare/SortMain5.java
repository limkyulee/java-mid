package collection.compare;

import java.util.TreeSet;

/**
 * Tree 구조와 정렬
 * TreeSet, TreeMap 과 같은 이진 탐색 트리 구조는 데이터를 보관할 때, 데이터를 정렬하면서 보관함.
 * 정렬 기준을 제공하는 것이 필수.
 */
public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);

//      PLUS : TressSet 은 애초에 Tree 에 넣을 때부터 정렬 기준에 따라 정렬이 됨.
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);

//      PLUS : 따로 정렬 기준을 지정하고싶으면 생성할 때, 정렬 기준을 지정해주어야 함.
        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);
    }
}
