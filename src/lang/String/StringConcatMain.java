package lang.String;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "world";

//      자바에서 문자열을 더할 때는 String 이 제공하는 concat 과 같은 메서드를 사용해야한다.
//      하지만 문자열은 너무 자주 다루어지기 때문에 "+" 연산자의 사용을 허용한다.
        String result1 = a.concat(b);
        String result2 = a + b;

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
    }
}
