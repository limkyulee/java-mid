package generic.test.example3;

import generic.test.example3.unit.Marine;
import generic.test.example3.unit.Zealot;
import generic.test.example3.unit.Zergling;

//  Q :  Shuttle 을 활용하여 UnitPrinter 클래스를 만들어라.
//      > 조건 1. UnitPrinter.printV1() 은 제네릭 메서드로 구현해야 한다.
//      > 조건 2. UnitPrinter.printV2() 는 와일드 카드로 구현해야 한다.
//      > 조건 3. 두 메서드는 셔틀에 들어있는 유닛의 정보를 출력한다.
public class UnitPrinterTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿", 100));

        UnitPrinter.printV1(shuttle1);
        UnitPrinter.printV2(shuttle2);

    }
}
