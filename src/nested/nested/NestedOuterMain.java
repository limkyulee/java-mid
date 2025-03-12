package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
//        NestedOuter nestedOuter = new NestedOuter();
//      바깥 클래스와 상관 없이 선언 가능.
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

//      PLUS : 내부 클래스 정보 출력 | 바깥 클래스 + `$` + 중첩 클래스
        System.out.println("nestedClass : " + nested.getClass());
    }
}
