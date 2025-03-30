package collection.set;

import collection.set.member.Member;

/**
 * Object 의 해시 코드 비교
 * Object 가 기본으로 제공하는 hashCode() 는 객체의 참조값을 해시 코드로 사용.
 * 따라서 각각의 인스턴스마다 서로 다른 값을 반환.

 * 자바가 기본으로 제공하는 클래스들은 (ex : Integer, String, Boolean ...)
 * 대부분 내부 값을 기반으로 해시 코드를 구할 수 있도록 hashCode() 메서드를 재정의함.
 * 따라서, 값이 같을 경우 같은 해시 코드를 반환.

 * Member 클래스는 id 를 기반으로 hashCode() 를 반환하도록 재정의함.
 * 때문에, id 가 같게 인스턴스를 생성할 경우 같은 해시 코드를 반환.
 */

public class JavaHashCodeMain {
//  PLUS : Object 의 기본 hashCode 는 객체의 참조값을 기반으로 생성.
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.hashCode() : " + obj1.hashCode());
        System.out.println("obj2.hashCode() : " + obj2.hashCode());
        System.out.println("obj1 : " + obj1);
        System.out.println("obj2 : " + obj2);

//      PLUS : 각 클래스마다 hashCode 를 이미 오버라이딩 해둠.
        Integer i = 10;
        String strA = "A";
        String strB = "AB";

        System.out.println("i.hashCode() : " + i.hashCode());
        System.out.println("strA.hashCode() : " + strA.hashCode());
        System.out.println("strB.hashCode() : " + strB.hashCode());

//      PLUS : hashCode 의 값은 마이너스 값이 들어올 수 있음.
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

//      Q : 둘은 같을까?
//      A : 인스턴스는 다르지만, equals 는 같음.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

//      equals, hashCode 를 오버라이딩 하지 않은 경우 vs 한 경우
        System.out.println("(member1 == member2) : " + (member1 == member2)); // false : 인스턴스가 다름. (동일성)
        System.out.println("member1.equals(member2) : " + (member1.equals(member2))); // true : 두 객체가 논리적으로 같음 (동등성)

//      Member 클래스에서 hashCode() 메서드를 재정의하지 않을 경우 hashCode 의 값은 다르게 나올 것임.
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }

}
