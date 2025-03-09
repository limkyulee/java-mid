package lang.String.test;

public class TestString8 {
//  Q : replace() 를 사용하여 java 라는 단어를 jvm 으로 변경하라.
    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        String changed = input.replace("java", "jvm");

        System.out.println("changed : " + changed);
    }
}
