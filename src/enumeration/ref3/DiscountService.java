package enumeration.ref3;

public class DiscountService {

//  REFACTOR : 할인율 계산 록직 삭제.
    public int discount(Grade grade, int price) {
        return price * grade.discount(price);
    }
}
