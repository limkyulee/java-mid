package nested.anonymous;

import nested.local.LocalOuterV2;
import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

//      익명 클래스 : 지역 클래스의 종류 중 하나로 클래스의 이름이 없다는 것이 특징.
//          > Printer 인터페이스를 상속하면서 바로 구현 (인터페이스 생성 X).
//          > 생성과 선언을 동시에 진행.
        Printer printer = new Printer(){
            int value = 0;

            @Override
            public void print() {
                System.out.println("value : " + value);
                System.out.println("localVar : " + localVar);
                System.out.println("paramVar : " + paramVar);
                System.out.println("outInstanceVar : " + outInstanceVar);
            }
        };

        printer.print();
//      출력 예시 : class nested.anonymous.AnonymousOuter$1
        System.out.println("printer.class : " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter anonymousOuter = new AnonymousOuter();
        anonymousOuter.process(2);
    }
}
