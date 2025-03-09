package lang.String;

public class StringBasicMain {
    public static void main(String[] args) {
//        String 은 클래스 이다, int,boolean 같은 기본형이 아닌 참조형이다.
        String str1 = "hello"; // 기존
        String str2 = new String("hello"); // 자바 언어에서 다음과 같이 변경해줌.

        System.out.println(str1);
        System.out.println(str2);
    }
}
