package generic.example4;

public class MethodMain1 {
    public static void main(String[] args) {

        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

//      타입 인자 명시적 전달
//      PLUS : generic 메서드는 메서드를 호출하는 시점에 타입 인자를 지정함.
//        > 특정 메서드 단위로 generic 을 도입할 때 사용.
//        > 메서드 반환타입 왼쪽에 <> 를 사용하여 타입 매개변수를 작성.
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerVal = GenericMethod.<Integer>numberMethod(10);
        Double doubleVal = GenericMethod.<Double>numberMethod(10.0);

//      LIMIT : 타입 제한 | 컴파일 오류 발생.
//        String stringVal = GenericMethod.<String>numberMethod("String");


//      PLUS : generic 메서드 타입 추론 가능.
        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerVal1 = GenericMethod.numberMethod(10);
        Double doubleVal1 = GenericMethod.numberMethod(10.0);
    }
}
