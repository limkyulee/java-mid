package generic.test.example3;

import generic.test.example3.unit.BioUnit;

public class UnitPrinter {
//  제네릭 사용
    public static <T extends BioUnit> void printV1(Shuttle<T> t) {
        T unit = t.out();
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }

//  와일드 카드를 사용
    public static void printV2(Shuttle<? extends BioUnit> t) {
//      상한 타입으로 반환
        BioUnit unit = t.out();
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }
}
