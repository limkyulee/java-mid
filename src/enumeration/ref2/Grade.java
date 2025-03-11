package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercentage;

//  Private 생성자.
    Grade(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

//  열거형도 class 이기 떄문에 메서드 추가 가능.
    public int getDiscountPercentage() {
        return discountPercentage;
    }
}
