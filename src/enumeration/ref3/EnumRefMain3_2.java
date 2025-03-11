package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        int basic = Grade.BASIC.discount(price);
        int gold = Grade.GOLD.discount(price);
        int diamond = Grade.DIAMOND.discount(price);

        System.out.println("ref BASIC : " + basic);
        System.out.println("ref GOLD : " + gold);
        System.out.println("ref DIAMOND : " + diamond);
    }
}
