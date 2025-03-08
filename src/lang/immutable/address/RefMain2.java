package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //  참조값 대입을 막을 수 있는 방법이 없다. (자바 문법 상 문제 없음)
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산"); // setValue 메서드를 찾을 수 없음. > final 불변 > 변경 불가.
        b = new ImmutableAddress("부산"); // 값을 바꾸지 못해 새로운 객체를 생성하여 값을 바꿔야함.
        System.out.println("서울 -> " + a);
        System.out.println("부산 -> " + b);
    }
}
