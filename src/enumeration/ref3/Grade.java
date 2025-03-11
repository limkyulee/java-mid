package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercentage;

//  Private 생성자.
    Grade(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

//  캡슐화 원칙 | 객체지향 관점에서 자신의 데이터를 외부에 노출하는 것 보다, 계산하고자 하는 값을 스스로 관리하는 것이 더 맞다.
    public int discount(int price){
        return price * discountPercentage / 100;
    }
}
