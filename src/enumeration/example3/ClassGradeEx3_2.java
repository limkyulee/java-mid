package enumeration.example3;

public class ClassGradeEx3_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

//      PLUS : 외부에서 임의로 Enum 클래스를 생성할 수 없다.
//          > 열거형 내부에서 상수로 지정하는 것 외에 직접 생성이 불가하다.
//        Grade bewGrade = new Grade(); // compile error
        int result = discountService.discount(Grade.BASIC, price);
        System.out.println("newGrade 등급의 할인 금액 : " + result);
    }
}
