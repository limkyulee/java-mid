package enumeration.example1;

public class DiscountService {

//  주석을 달아놓느다고 하더라도 String 타입을 받도록 하게되면
//  StringGrade 의 값이 아닌 다른 값을 받아도 문제가 되지않기 떄문에 오류를 막을 수 없다.
//  FIXME : StringGrade 를 사용하세요.
    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals(StringGrade.BASIC)) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + " : 할인X");
        }

        return price * discountPercent / 100;
    }
}
