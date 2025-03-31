package collection.map.test.member;

//  Q : Map 을 사용하여 회원을 저장하고 관리하는 MemberRepository 코드를 완성하라.
//    : Member, MemberRepositoryMain 코드와 실행 결과를 참고하라.
public class MemberRepositoryMain {
    public static void main(String[] args) {
        Member member1 = new Member("id1", "회원 1");
        Member member2 = new Member("id2", "회원 2");
        Member member3 = new Member("id3", "회원 3");

//      회원 저장
        MemberRepository repository = new MemberRepository();
        repository.save(member1);
        repository.save(member2);
        repository.save(member3);

//      회원 조회
        Member findMember1 = repository.findById("id1");
        System.out.println("findMember1 : " + findMember1);

        Member findMember3 = repository.findByName("회원 3");
        System.out.println("findMember3 : " + findMember3);

//      회원 삭제
        repository.remove("id1");
        Member removedMember1 = repository.findById("id1");
        System.out.println("removedMember1 : " + removedMember1);

    }
}
