package lang.String.method;

public class StringInfoMain {
    public static void main(String[] args) {

        String str = "Hello Java!";
        System.out.println("문자열의 길이 : " + str.length());
        System.out.println("문자열이 비어 있는지 : " + str.isEmpty());
        System.out.println("문자열이 비어있거나 공백인지1 : " + str.isBlank());
        System.out.println("문자열이 비어있거나 공백인지2 : " + "      ".isBlank());

        char c= str.charAt(7);
        System.out.println("Hello Java! 의 7번 인덱스의 문자 : " + c);
    }
}
