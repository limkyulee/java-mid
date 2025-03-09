package lang.String.test;

public class TestString2 {
//  Q : length 를 사용하여 arr 배열에 들어있는 모든 문자열 길이의 합을 구하여라.
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int result = 0;
        for(String s : arr) {
            int slen = s.length();
            result += slen;
        }

        System.out.println("result: " + result);
    }
}
