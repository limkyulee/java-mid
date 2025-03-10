package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 숫자 _ 래퍼 객체 변환
        Integer i2 = Integer.valueOf("10"); // 문자 _ 래퍼 객체 변환
        int intValue = Integer.parseInt("10"); // 문자열 전용, 기본형 반환

//        비교
//        내 값과 인스로 넘어온 값을 비교함.
//        > 내 값이 크면 1
//        > 내 값과 같으면 0
//        > 내 값이 작으면 -1
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult: " + compareResult); // -1

//        산출 연산
        System.out.println("sum :" + Integer.sum(10,20));
        System.out.println("min :" + Integer.min(10,20));
        System.out.println("max :" + Integer.max(10,20));
    }
}
