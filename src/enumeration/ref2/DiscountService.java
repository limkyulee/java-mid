package enumeration.ref2;

public class DiscountService {
//  REFACTOR : 뷸팔요한 If 문 로직 삭제.
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercentage() / 100;
    }
}
