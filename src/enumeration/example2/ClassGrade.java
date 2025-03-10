package enumeration.example2;

// FIXME : 타입 안전 열거형 패턴
public class ClassGrade {
//  각각의 상수는 모두 ClassGrade 타입을 기반으로 인스턴스를 생성함.
    public static final ClassGrade BASIC = new ClassGrade(); // X001
    public static final ClassGrade GOLD = new ClassGrade(); // X002
    public static final ClassGrade DIAMOND = new ClassGrade(); // X003

//  내부에서는 생성자 생성 가능
    private ClassGrade() {}
}
