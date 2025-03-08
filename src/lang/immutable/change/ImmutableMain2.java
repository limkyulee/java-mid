package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj immutableObj1 = new ImmutableObj(10);
//        불변객체에서 값을 변경했을 경우, 꼭 반환값을 받아서 처리해야한다.
//        반환값을 받지않을 경우, 생성되었지만 사용되지않는 객체이므로 gc에 의해 처리된다.
        immutableObj1.add(20);

//       기존 객체의 값은 변경되지않는다.
        System.out.println("immutableObj1 = " + immutableObj1.getValue());
    }
}
