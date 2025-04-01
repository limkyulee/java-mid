package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] users = new MyUser[]{myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(users));

        System.out.println("Comparable 기본 정렬");
//      PLUS : Comparable 기존 정렬.
//         > MyUser 에 정의해둔 compare 메서드 사용.
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        System.out.println("IdComparator 정렬");
//      PLUS : 비교자를 넘겨 정렬 방식을 지정하여 정렬.
//         > 인수로 IdComparator 비교자를 넘길 경우, 해당 비교자에 정의된 compare 메서드 사용.
        Arrays.sort(users, new IdComparator());
        System.out.println(Arrays.toString(users));

        System.out.println("IdComparator().reverse() 정렬");
        Arrays.sort(users, new IdComparator().reversed());
        System.out.println(Arrays.toString(users));

//      LIMIT : Comparable 도 구현하지 않고, Comparator 도 제공하지 않을 경우, 런타임 오류 발생.
//         > java: collection.compare.MyUser is not abstract
//                 and does not override abstract method compareTo(collection.compare.MyUser) in java.lang.Comparable
    }
}
