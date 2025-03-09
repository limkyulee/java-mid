package lang.String.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // X001
        String str2 = new String("hello"); // X002

        System.out.println("str1 == str2: " + (str1 == str2)); // 동일성비교 : 참조값이 다르기 때문에 당연히 false
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // 동등성비교 : String 클래스가 제공하는 문자열 비교 방법

//        문자열 리터럴 / 문자열 풀(String pool)
//        문자열 리터럴을 사용할 경우, 문자열 풀에서 "hello" 라는 문자를 가진 String 인스턴스를 찾아 해당하는 인스턴스의 참조를 반환한다.
        String str3 = "hello"; // X003 (문자열 리터럴 > 문자열 풀에 생성)
        String str4 = "hello"; // X003 (이미 존재하는 리터럴 > 미생성 - 문자열 풀에서 찾아서 제공)
//        문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 최적화 및 성능 향상에 도움이 된다.

        System.out.println("str3 == str4: " + (str3 == str4));
        System.out.println("str3.equals(str4): " + str3.equals(str4));
    }
}
