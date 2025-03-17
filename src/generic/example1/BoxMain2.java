package generic.example1;

public class BoxMain2 {
//  REFACTOR : ObjectBox 로 중복 제거.
//    > 장점 : 기존 코드 재사용 가능.
//    > 단점 : 원하지 않는 타입이 들어갈 수 있음. (타입 안정성 떨어짐)
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
//      Integer 로 다운캐스팅
        Integer integer = (Integer) integerBox.get();
        System.out.println("Integer value: " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("test");
//      String 으로 다운캐스팅
        String string = (String) stringBox.get();
        System.out.println("String value: " + string);

//      잘못된 타입의 인수 전달 시
        integerBox.set("문자 100");
        Integer integer2 = (Integer) integerBox.get(); // String => Integer 캐스팅 예외 [오류 발생]
        System.out.println("Integer value : " + integer2);
    }
}
