package lang.String.test;

public class TestString7 {
//  Q : 문자의 양쪽 공백을 제거하라. 예) '       Hello World     ' -> 'Hello World'"
    public static void main(String[] args) {
        String original = "       Hello World       ";
        String trimmed = original.trim();

        System.out.println("trimmed : '" + trimmed + "'");
    }
}
