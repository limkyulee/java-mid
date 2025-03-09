package lang.String.test;

public class TestString1 {
//  Q : startWith() 를 사용하여 url 이 https:// 로 시작하는지 확인.
    public static void main(String[] args) {
        String url = "https://www.example.com";
        boolean result = url.startsWith("https://");
        System.out.println("Is url starts with 'https://' ? " + result); // true 출력
    }
}
