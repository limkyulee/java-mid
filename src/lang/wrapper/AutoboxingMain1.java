package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
//        Primitive => Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

//        Wrapper => Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("Value of boxed value is " + boxedValue);
        System.out.println("Value of unboxed value is " + unboxedValue);
    }
}
