package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원 A", address);
        MemberV1 memberB = new MemberV1("회원 B", address);

//        회원 A 회원 B 의 처음 주소는 모두 서울
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);

//       요구사항 : 회원 B 의 주소를 부산으로 변경하여야함.
        memberB.getAddress().setValue("부산");
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);
//        위와 같이 변경 시, 같은 Address 를 참조하고있기 떄문에 A,B 모두의 주소가 변경되는 사이드 이펙트가 빌생한다.


    }
}
