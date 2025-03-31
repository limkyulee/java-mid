package collection.set.test;

import java.util.HashSet;
import java.util.Set;

//  Q : RectangleTest 실행 결과를 참고해서 Rectangle 클래스를 완성하라.
//    : Rectangle 클래스는 width 와 height 가 모두 같으면 같은 값으로 정의한다.
public class RectangleTest {
    public static void main(String[] args) {
        Set<Rectangle> set = new HashSet<>();
        set.add(new Rectangle(10,10));
        set.add(new Rectangle(20,20));
        set.add(new Rectangle(20,20)); // 중복

        for (Rectangle r : set) {
            System.out.println(r);
        }
    }
}
