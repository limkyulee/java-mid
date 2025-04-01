package collection.compare;

import java.util.Comparator;

//  FIXME : 아이디를 기준으로 정렬할 때 시용.
public class IdComparator implements Comparator<MyUser> {
    @Override
    public int compare(MyUser o1, MyUser o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
