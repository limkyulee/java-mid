package lang.object.toString;

public class toStringMain2 {
    public static void main(String[] args) {

        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 3);

        System.out.println("1. 단순 toString 호출");

        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());


        System.out.println("2. println 내부에서 toString 호출");

        System.out.println(car);
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("3. Object 다형성 활용");

        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        System.out.println("4. 참조값 확인하기");

//        참조값 확인하는 법(toHexString > 16진수로 바뀜 - 문자로 바뀜)
        String hexString1 = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("Dog1" + hexString1);

        String hexString2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("Dog2" + hexString2);
    }
}
