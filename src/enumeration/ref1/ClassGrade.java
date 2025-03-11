package enumeration.ref1;

// REFACTOR : 등급이 할일율을 가지도록 작성.
public class ClassGrade {
//  각각의 상수는 모두 ClassGrade 타입을 기반으로 인스턴스를 생성함.
    public static final ClassGrade BASIC = new ClassGrade(10); // X001
    public static final ClassGrade GOLD = new ClassGrade(20); // X002
    public static final ClassGrade DIAMOND = new ClassGrade(30); // X003

    private final int discountPercent;

//  내부에서는 생성자 생성 가능
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
