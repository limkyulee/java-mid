package enumeration.example1;

public class StringGradeEx1_2 {
//  문자열과 타입 안정성 : 문자열 사용 시, 발생할 수 있는 문제 예시.
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

//      존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액 : " + vip);

//      오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액 : " + diamondd);

//      소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 : " + gold);
    }
}
