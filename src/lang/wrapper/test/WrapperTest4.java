package lang.wrapper.test;

public class WrapperTest4 {
//    Q : String str 을 Integer 로 변환하여 출력하라.
//    : Integer 을 int 로 변환하여 출력하라.
//    : int 을 Integer 로 변환하여 출력하라.
//    : 오토 박싱, 오토 언받식을 사용하여 반환해야한다.
    public static void main(String[] args) {
        String str = "100";

//        String => Integer
        Integer integerVal = Integer.valueOf(str);
        System.out.println("integerVal = " + integerVal);

//        Integer => int
        int intVal = integerVal;
        System.out.println("intVal = " + intVal);

//        int => Integer
        Integer integerVal2 = intVal;
        System.out.println("integerVal2 = " + integerVal2);
    }
}
