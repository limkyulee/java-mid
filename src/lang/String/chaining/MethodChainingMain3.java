package lang.String.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
//        체인처럼 연결되어있는 형태를 보여 메서드 체인이라 한다.
        ValueAdder valueAdder = new ValueAdder();
        int result = valueAdder.add(1).add(2).add(3).getValue();

        System.out.println("result = " + result);
    }
}
