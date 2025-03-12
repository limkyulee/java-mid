package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

//  중첩 클래스 (안에 있지만 내것[바깥 클래스]이 아님)
    static class Nested{
        private int nestedInstanceValue = 1;

        public void print(){

//          자신의 멤버에 접근
            System.out.println("nestedInstanceValue : " + nestedInstanceValue);

//          바깥 클래스의 인스턴스 멤버에는 접근 불가.
//          System.out.println("outInstanceValue : " + outInstanceValue);

//          바깥 클래스의 멤버에는 접근 가능.
//          private 도 접근 가능.
//              > private 을 사용할 수 있는 내부 범위 안에 내부 클래스도 포함되어있기 때문.
//            System.out.println("outClassValue : " + NestedOuter.outClassValue);
            System.out.println("outClassValue : " + outClassValue); // 줄여서 사용 가능.

        }
    }
}
