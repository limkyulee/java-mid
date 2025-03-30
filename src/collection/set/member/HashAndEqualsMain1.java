package collection.set.member;

import collection.set.MyHashSetV2;

//  FIXME : equals(), hashCode() 를 구현하지 않은 경우.
//    > Object 의 기본 기능을 사용.
//    > hashCode : 객체의 참조값을 반환. => id 가 같아도 다른 값으로 인식.
public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() : " + m1.hashCode());
        System.out.println("m2.hashCode() : " + m2.hashCode());
        System.out.println("m1.equals(m2) : " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean found = set.contains(searchValue);
        System.out.println("found = " + found);
    }
}
