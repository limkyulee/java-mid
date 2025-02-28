package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
//        참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
//        a와 b는 동일한 참조값을 통해 동일한 인스턴스를 바라보기 때문에 하나의 값을 바꾸면 두 값이 모두 바뀐다.
        System.out.println("서울 -> " + a);
        System.out.println("부산 -> " + b);
    }
}
