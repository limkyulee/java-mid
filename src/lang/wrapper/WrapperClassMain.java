package lang.wrapper;

public class WrapperClassMain {
//  Boxing : 기본형을 래퍼 클래스로 변경하는 것을 의미.
//  > 마치 박스에 물건을 넣은 것 같은 모습을 묘사
    public static void main(String[] args) {
//      Deprecated : Integer 는 곧 삭제될 예정을 의미, > 사용하지 않는 것을 권장함.
        Integer newInteger = new Integer(10);

//       아래와 같이 사용하는 것을 권장함.
        // -128 ~127 자주 사용하는 숫자 값 재사용(Java 가 미리 만들어 놓을 값을 반환 > 성능 최적화). 불변
        Integer integerObject = Integer.valueOf(10);
        Long longObject = Long.valueOf(10);
        Double doubleObject = Double.valueOf(10);

        System.out.println("new Integer: " + newInteger);
        System.out.println("integerObject: " + integerObject);
        System.out.println("longObject: " + longObject);
        System.out.println("doubleObject: " + doubleObject);

//      Unboxing : Wapper 클래스에 들어있는 기본형을 다시 꺼내오는 것을 의미.
        System.out.println("내부 값 읽기");
        System.out.println("Integer : " + integerObject.intValue());
        System.out.println("Long : " + longObject.longValue());
        System.out.println("Double : " + doubleObject.doubleValue());

        System.out.println("값 비교하기");
        System.out.println("== 비교 : " + (newInteger == integerObject));
        System.out.println("equals 비교 : " + (newInteger.equals(integerObject)));
    }
}


