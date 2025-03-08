package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj mutableObj = new MutableObj(10);
        mutableObj.add(20);

//        계산 이후에 기존 값은 사라짐.
        System.out.println("mutableObj = " + mutableObj.getValue());
    }
}
