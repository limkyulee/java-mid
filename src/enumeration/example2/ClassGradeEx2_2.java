package enumeration.example2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

//      문제 : 외부에서 임의로 ClassGrade 인스턴스를 새로 생성할 수 있다.
//        > ClassGrade 를 넘기면 된다고 착각할 수 있다.
//        > 해결법 : 생성자를 private 으로 외부에서 생성할 수 없게 막아야함.
//        ClassGrade newClassGrade = new ClassGrade(); // compile error
        int result = discountService.discount(ClassGrade.BASIC, price);

        System.out.println("newClassGrade  등급의 할인 금액 : " + result);
    }
}
