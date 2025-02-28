package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
//        a와 b는 동일한 참조값을 통해 동일한 인스턴스를 바라보기 때문에 하나의 값을 바꾸면 두 값이 모두 바뀐다.
        System.out.println("서울 -> " + a);
        System.out.println("부산 -> " + b);
    }

    private static void change(Address a, String changeAddress) {
        System.out.println("주소를 변경합니다 -> " + changeAddress);
        a.setValue(changeAddress);
    }
}
