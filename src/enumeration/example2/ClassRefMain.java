package enumeration.example2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC : " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD : " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND : " + ClassGrade.DIAMOND.getClass());

//      각각의 상수는 모두 서로 다른 ClassGrade 인스턴스를 참조하기 때문에
//      > 서로 다른 참조값을 가짐.
//      > 타입은 동일하지만 인스턴스가 다름.
        System.out.println("ref BASIC : " + ClassGrade.BASIC);
        System.out.println("ref GOLD : " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND : " + ClassGrade.DIAMOND);
    }
}
