package enumeration.ref1;

public class DiscountService {
//  REFACTOR : 뷸팔요한 If 문 로직 삭제.
    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;
    }
}
