package lang.wrapper.test;

public class WrapperTest1 {
//  Q : 문자로 입력된 str1, str2 두 수의 합을 구하라.
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int str3 = Integer.parseInt(str1) + Integer.parseInt(str2);

        System.out.println("두 수의 합 : " + str3);
    }
}
