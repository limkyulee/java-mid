package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
//      MyInteger 는 객체이므로 자신이 가진 메서드를 편리하게 호출할 수 있다.
        MyInteger myInteger = new MyInteger(10);
        int i1 = myInteger.compareTo(5);
        int i2 = myInteger.compareTo(10);
        int i3 = myInteger.compareTo(20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
