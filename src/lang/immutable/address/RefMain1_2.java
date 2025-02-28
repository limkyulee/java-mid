package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
//        서로 다른 인스턴스를 참조하게 하여, 두 값의 변경이 서로에게 영향을 끼치지 않도록 한다.
//        객체를 공유하지 않음
        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");

        System.out.println("서울 -> " + a);
        System.out.println("부산 -> " + b);
    }
}
