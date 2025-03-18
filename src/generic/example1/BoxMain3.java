package generic.example1;

public class BoxMain3 {
//  REFACTOR : Generic 의 사용
//    > 코드 재사용 및 타입 안정성 유지 가능.
//    > 타입 매개변수(<T>)에 타입 인자(ex | <Integer> - Integer)를 전달하여 사용.
    public static void main(String[] args) {
//      생성하는 시점에 타입 지정됨.
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
//        integerBox.set("String"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get();
        System.out.println("integer : " + integer);

//      생성하는 시점에 타입 지정됨.
        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("String");
//        stringBox.set(10); // String 타입만 허용, 컴파일 오류
        String string = stringBox.get();
        System.out.println("String : " + string);

        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(3.14);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue : " + doubleValue);

//      PLUS : 타입 추론
//        > 생성하는 제네릭 타입 생략 가능.
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
    }
}
