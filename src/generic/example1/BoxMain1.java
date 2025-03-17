package generic.example1;

public class BoxMain1 {
//  IntegerBox, StringBox 사용
//    > 장점 : 타입 안정성이 높음.
//    > 단점 : 코드 재사용성이 낮음.
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer : " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string : " + string);
    }
}
