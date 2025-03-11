package enumeration.example3;

public class EnumRefMain {
    public static void main(String[] args) {
//      모두 같은 Class 를 참조.
        System.out.println("class BASIC : " + Grade.BASIC.getClass());
        System.out.println("class GOLD : " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND : " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC : " + refValue(Grade.BASIC));
        System.out.println("ref GOLD : " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND : " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Object grade){
//      System.identityHashCode(grade) : 저버거 관리하는 객체의 참조값을 숫자로 반환.
//      Integer.toHexString : 숫자를 16진수로 변환.
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
