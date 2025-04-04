package collection.set.member;

import collection.set.MyHashSetV2;

//  FIXME : hashCode() 는 구현하였지만 equals() 를 구현하지 않은 경우.
//    > equals : 객체의 참조값으로 대조값이 같음을 비교. => 중복 데이터가 없다고 판단.
public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A"); // X01
        MemberOnlyHash m2 = new MemberOnlyHash("A"); // X02
        System.out.println("m1.hashCode() : " + m1.hashCode());
        System.out.println("m2.hashCode() : " + m2.hashCode());
        System.out.println("m1.equals(m2) : " + m1.equals(m2));

//      참조값 확인
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean found = set.contains(searchValue);
        System.out.println("found = " + found);
    }
}
