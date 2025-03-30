package collection.set.member;

//  FIXME : equals, hashCode 를 재정의 하지않은 클래스.
public class MemberNoHashNoEq {
    private String id;

    public MemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
