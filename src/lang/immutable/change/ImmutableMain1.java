package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj immutableObj1 = new ImmutableObj(10);
        ImmutableObj immutableObj2 = immutableObj1.add(20);

//        불변 객체를 설계할 때, 불변객체의 값을 바꿔야하는 경우가 있는데
//        이 경우에 기존 객체의 값은 유지시키고 계산 결과를 바탕으로 새로운 객체를 생성하여 반환하도록 한다.
        System.out.println("immutableObj1 = " + immutableObj1.getValue());
        System.out.println("immutableObj2 = " + immutableObj2.getValue());
    }
}
