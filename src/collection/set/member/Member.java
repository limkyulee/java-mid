package collection.set.member;

import java.util.Objects;

/**
 * 직접 구현하는 hashCode()
 * hashCode() 를 재정의할 때,
 * Objects.hash() 에 해시 코드로 사용할 값을 지정해주면 쉽게 해시 코드를 생성할 수 있음.
 * hashCode() 를 재정의하지 않으면 Object 가 기본으로 제공하는 hashCode() 를 사용함.
 * 이는 인스턴스 참조값을 반환.
 * 따라서, id 가 같아도 해시코드를 다르게 반환.

 * hashCode() 를 id 를 기반으로 재정의한 덕분에,
 * 인스턴스가 달라도 id 가 같으면 같은 해시 코드를 반환.
 */
public class Member {
    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//  PLUS : equals, hashCode
//    > id 가 같은 멤버는 같은 해시코드를 가지도록 함.
//    > IDE 를 기반으로 재정의하면 됨.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
