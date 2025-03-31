package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> members = new HashMap<>();

    public void save(Member member) {
        members.put(member.getId(), member);
    }

    public Member findById(String id) {
        return members.get(id);
    }

    public void remove(String id) {
        members.remove(id);
    }

    public Member findByName(String value) {
        for (Member member : members.values()) {
            if (member.getName().equals(value)) {
                return member;
            }
        }
        return null;
    }
}
