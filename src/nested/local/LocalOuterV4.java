package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar){

        int localVar = 1;

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

        Printer printer = new LocalPrinter();

//      Q | 만약 localVar 값을 변경한다면?
//        localVar = 10;
//      A | LocalPrinter 를 생성하는 시정에서 지역 변수의 localVar, paramVar 를 캡쳐.
//        | 캡쳐한 이후에 지역 변수의 값 변경.
//        | 이 때, 동기화 문제 발생.

//      FIXME : 동기화 문제
//        > 스택 영역에 존재하는 지역 변수의 값과 인스턴스에 캡쳐한 캡쳐 변수의 값이 서도 달라지는 문제.
//        > 멀티 스레드 상황에서 이런 동기화는 상당히 복잡한 문제.
//        > 따라서, 캡쳐한 지역변수의 값을 바꾸지 못하도록 막아 해당 문제를 근복적으로 차단함.
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV3 = new LocalOuterV4();

        Printer printer = localOuterV3.process(2);

        printer.print();

        System.out.println("필드 확인");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField : " + declaredField);
        }
    }
}
