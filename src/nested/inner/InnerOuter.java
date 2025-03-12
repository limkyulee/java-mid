package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

//  내부 클래스 (나[바깥 클래스]의 내부에 있는 나를 구성하는 요소)
//    > 실제로 내부 인스턴스가 바깥 인스턴스 안에 생성되는 것은 아님.
//    > 개념상 인스턴스 안에 생성된다고 이해할 수 있지만
//    > 정확히 내부 인스턴스는 바깥 인스턴스의 참조를 보관함
//    > 이 참조를 통해 바깥 인스턴스의 멤버에 접근 가능.
    class Inner{
        private int innerInstanceValue = 1;

        public void print(){
//          자신의 멤버에 접근
            System.out.println("innerInstanceValue : " + innerInstanceValue);

//          외부 클래스의 인스턴스 멤버에 접근 가능.
//          private 도 접근 가능.
            System.out.println("outInstanceValue : " + outInstanceValue);

//          외부 클래스의 클래스 멤버에 접근 가능.
//          private 도 접근 가능.
            System.out.println("outClassValue : " + outClassValue);
        }
    }
}
