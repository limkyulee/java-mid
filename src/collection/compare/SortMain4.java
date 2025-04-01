package collection.compare;

import java.util.LinkedList;

//  FIXME : 정렬은 배열 뿐만 아니라 List 같은 자료 구조에도 사용할 수 있음.
public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null);
//      Collections.sort(list)
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());
//      Collections.sort(list, new IdComparator())
        System.out.println(list);
    }
}
