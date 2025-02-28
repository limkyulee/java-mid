package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    public String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj; // down casting 하지 않으면 Object 타입에서는 id 를 찾을 수 없는 이슈 발생.
//        return this.id.equals(user.id);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
