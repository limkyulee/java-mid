package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

//      PLUS : 인터페이스 구현 가능.
        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value : " + value); // 자신의 인스턴스
                System.out.println("localVar : " + localVar); // 자신이 속한 코드블록의 지역변수
                System.out.println("paramVar : " + paramVar); // 자신이 속한 코드블롭의 매개 변수(매개변수도 지역변수)
                System.out.println("outInstanceVar : " + outInstanceVar); // 바깥 클래스의 인스턴스 멤버
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV2 = new LocalOuterV2();
        localOuterV2.process(2);
    }
}
