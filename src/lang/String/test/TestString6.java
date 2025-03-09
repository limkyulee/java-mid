package lang.String.test;

public class TestString6 {
//  Q : indexOf 와 반복문을 활용하여 str 에서 key 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력하라.
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);

        while (index != -1) {
            index = str.indexOf(key, index + 1);
            count++;
        }

        System.out.println("count : " + count);
    }
}
