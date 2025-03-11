package enumeration.ref3;

public class EnumRefMain3_1 {
//  REFACTOR : DiscountService 제거
    public static void main(String[] args) {
        int price = 10000;

        System.out.println("ref BASIC : " + Grade.BASIC.discount(price));
        System.out.println("ref GOLD : " + Grade.GOLD.discount(price));
        System.out.println("ref DIAMOND : " + Grade.DIAMOND.discount(price));
    }
}
