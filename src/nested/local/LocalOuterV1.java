package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

//      지역 클래스 : 지역 변수처럼 코드 블럭 안에 클래스를 선언.
//      PLUS : 지역 클래스도 내부 클래스이기 때문에 바깥 클래스의 인스턴스 멤버에 접근 가능.
//           : 접근 제어자 (ex. private) 사용 불가.
        class LocalPrinter{
            int value = 0;

            public void printDate(){
                System.out.println("value : " + value); // 자신의 인스턴스
                System.out.println("localVar : " + localVar); // 자신이 속한 코드블록의 지역변수
                System.out.println("paramVar : " + paramVar); // 자신이 속한 코드블롭의 매개 변수(매개변수도 지역변수)
                System.out.println("outInstanceVar : " + outInstanceVar); // 바깥 클래스의 인스턴스 멤버
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printDate();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
