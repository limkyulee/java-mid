package lang.String.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        ValueAdder valueAdder1 = valueAdder.add(1);
        ValueAdder valueAdder2 = valueAdder1.add(2);
        ValueAdder valueAdder3 = valueAdder2.add(3);

        int result = valueAdder3.getValue();
        System.out.println("result = " + result);
    }
}
