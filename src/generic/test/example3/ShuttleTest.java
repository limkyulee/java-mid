package generic.test.example3;

import generic.test.example3.unit.Marine;
import generic.test.example3.unit.Zealot;
import generic.test.example3.unit.Zergling;

//  Q : 다음 코드와 실행 결과를 참고해서 Shuttle 클래스를 만들어라.
//      > 조건 1. Shuttle 클래스는 제네릭 타입을 사용해야 한다.
//      > 조건 2. showInfo() 메서드를 통해 탑승한 유닛의 정보를 출력한다.
public class ShuttleTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 =  new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));
        shuttle1.showInfo();

        Shuttle<Zergling> shuttle2 =  new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));
        shuttle2.showInfo();

        Shuttle<Zealot> shuttle3 =  new Shuttle<>();
        shuttle3.in(new Zealot("저글링", 100));
        shuttle3.showInfo();
    }
}
