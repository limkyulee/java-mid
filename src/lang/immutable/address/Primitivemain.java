package lang.immutable.address;

public class Primitivemain {
    public static void main(String[] args) {
//        기본형은 절대로 같은 값을 공유하지 않는다.
//        같은 참조값을 가지지 않기 때문에 하나를 변경하면 그 값만 변경된다.
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
