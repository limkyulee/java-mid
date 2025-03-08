package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원 A", address);
        MemberV2 memberB = new MemberV2("회원 B", address);

//        회원 A 회원 B 의 처음 주소는 모두 서울
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);

//       요구사항 : 회원 B 의 주소를 부산으로 변경하여야함.
//        memberB.getAddress().setValue("부산"); // 컴파일 오류 발생
        ImmutableAddress changedAddress = new ImmutableAddress("부산");
        memberB.setAddress(changedAddress);
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);
//      불변 객체를 사용하면, 주소값만 변경할 수 있는 메서드가 없기 때문에 새로운 주소객체를 만들어서 대입해줘야한다. (사이드 이펙트 막을 수 있음)

    }
}
