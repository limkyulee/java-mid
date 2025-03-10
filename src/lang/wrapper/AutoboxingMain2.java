package lang.wrapper;

public class AutoboxingMain2 {
//  오토 박싱, 오토 언박싱 : 컴파일러가 개발자 대신 valueOf, xxxValue() 등의 코드를 추가해주는 기능.
//  > 기본형과 wrapper 의 변환을 편리하게 할 수 있음.
    public static void main(String[] args) {
//        Primitive => Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-boxing)

//        Wrapper => Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(Auto-unboxing)

        System.out.println("Value of boxed value is " + boxedValue);
        System.out.println("Value of unboxed value is " + unboxedValue);
    }
}
