package lang.String.test;

public class TestString9 {
//  split() 을 사용하여 이메일의 ID 부분과 도메인 부분을 분리하라.
    public static void main(String[] args) {
        String email = "hello@example.com";

        String id = email.split("@")[0];
        String domain = email.split("@")[1];

        System.out.println("Id : " + id);
        System.out.println("Domain : " + domain);
    }
}
