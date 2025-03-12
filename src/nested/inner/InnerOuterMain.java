package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
//      PLUS : 내부 클래스 생성
//        > 내부 클래스는 바깥 클래스의 인스턴스에 소속됨.
//        > 바깥 클래스의 인스턴스 정보를 알아야 생성할 수 있음.
        InnerOuter outer = new InnerOuter();
//      어느 인스턴스에 소속될 것인지 선언 시 지정해주어야함.
//        > 항상 바깥 클래스가 함께 정의되어 있어야함.
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("InnerClass : " + inner.getClass());
    }
}
