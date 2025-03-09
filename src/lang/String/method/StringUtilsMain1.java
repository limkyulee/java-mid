package lang.String.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello World!";

        String numStr = String.valueOf(num);
        System.out.println("숫자의 문자열 값 : " + numStr);

        String boolStr = String.valueOf(bool);
        System.out.println("불리언의 문자열 값 : " + boolStr);

        String objStr = String.valueOf(obj);
        System.out.println("객체의 문자열 값 : " + objStr);

//        문자 + x => 문자x
        String numStr2 = "" + num;
        System.out.println("빈 문자열 + num : " + numStr2);

//        toCharArray()
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 : " + strCharArray);

        for(char c : strCharArray) {
            System.out.print(c);
        }
    }
}
