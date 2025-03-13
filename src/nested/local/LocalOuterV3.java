package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

//  FIXME : 사실상 final 지역변수
//    > 지역 클래스가 접근하는 지역 변수는 절대로 중간에 값이 변하면 안됨. (변수 캡쳐와 연관)
//    > 지역변수에 final 키워드를 사용하지는 않았지만, 값을 변경하지 않는 지역 변수를 뜻함.
//    > final 지역변수는 final 키워드를 넣어도 동일하게 작동해야함.
    public Printer process(final int paramVar){

//      지역 변수는 스택 프레임이 종료되는 순간 함께 제거됨.
        final int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value : " + value); // 자신의 인스턴스

//              인스턴스는 지역변수보다 더 오래 살아남는다.
                System.out.println("localVar : " + localVar); // 자신이 속한 코드블록의 지역변수
                System.out.println("paramVar : " + paramVar); // 자신이 속한 코드블롭의 매개 변수(매개변수도 지역변수)
                System.out.println("outInstanceVar : " + outInstanceVar); // 바깥 클래스의 인스턴스 멤버
            }
        }

//      REFACTOR : LocalPrinter 인스턴스 반환.
        Printer printer = new LocalPrinter();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV3 = new LocalOuterV3();
//      REFACTOR : LocalPrinter 인스턴스를 반환하고 printer 변수에 참조를 보관.
//        > main() 이 종료될 때까지 LocalPrinter 생존.

//      PLUS : localVar, paramVar 와 같은 지역변수
//        > process 스택 프레임이 스택 영역에서 제거 되면서 함께 제거됨.
//        > 지역변수의 생명 주기가 매우 짧음 이슈.
        Printer printer = localOuterV3.process(2);

//      REFACTOR : printer.print() 를 process 의 스택 프레임이 사라진 후에 실행.
//        Q | 스택 프레임에서 사라진 localVar, paramVar 의 출력은 어떻게 실행되는가?
//        A | 지역 변수 캡쳐(Capture) : 스택 영역에 있는 변수가 아니라 인스턴스에 복사하여 캡쳐한 변수에 접근.
        printer.print();

//      FIXME : 캡쳐(Capture)
//        > int nested.local.LocalOuterV3$1LocalPrinter.value : 인스턴스 변수
//        > final int nested.local.LocalOuterV3$1LocalPrinter.val$localVar : 캡쳐 변수
//        > final int nested.local.LocalOuterV3$1LocalPrinter.val$paramVar : 캡쳐 변수
//        > final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0 : 바깥 클래스 참조
        System.out.println("필드 확인");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField : " + declaredField);
        }
    }
}
