package lang.String.test;

public class TestString11 {
//  Q : StringBuilder 에 있는 reverse()를 사용하여 str 문자열을 반대로 뒤집어라.
    public static void main(String[] args) {
        String str = "Hello Java";
        String reverseStr = new StringBuilder(str).reverse().toString();

        System.out.println(reverseStr);
    }
}
