package generic.test.example3;

import generic.test.example3.unit.Marine;
import generic.test.example3.unit.Zealot;

// Q : 다음 코드와 실행 결과를 참고하여 UnitUtil 클래스를 만들어라.
//  > 조건 1. 두 유닛을 입력 받아 체력이 높은 유닛을 반환핟다.
//  > 조건 2. 체력이 같은 경우 둘 중 아무나 반환해도 된다.
//  > 조건 3. 제네릭 메서드를 사용하라.
//  > 조건 4. 입력하는 유닛의 타입과 반환하는 유닛의 타입이 같아야한다.
public class UnitUtilTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("마린1", 40);
        Marine m2 = new Marine("마린2", 50);

        Marine resultMarin = UnitUtil.maxHp(m1,m2);
        System.out.println("resultMarin : " + resultMarin);

        Zealot z1 = new Zealot("질럿1", 100);
        Zealot z2 = new Zealot("질럿2", 150);

        Zealot resultZealot = UnitUtil.maxHp(z1,z2);
        System.out.println("resultZealot : " + resultZealot);
    }
}
