package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main (String[] args) {
        int iteration = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime, endTime;

//        기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
//        단순히 값을 반복해서 10억번을 더함.
        for (int i = 0; i < iteration; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Sum of primitive values: " + sumPrimitive);
        System.out.println("Elapsed time: " + (endTime - startTime));

//        래퍼 클래스 long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
//        단순히 값을 반복해서 10억번을 더함.
        for (int i = 0; i < iteration; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Sum of primitive values: " + sumWrapper);
        System.out.println("Elapsed time: " + (endTime - startTime));

//       기본형 연산이 래퍼 연상보다 빠른 것을 확인할 수 있음.
//       > 기본형은 메모리에서 단순히 그 크기만큼 공간을 차지하지만
//       > 래퍼 클래스의 인스턴스는 대부에 필드로 가지고 있는 기본형의 값 + 객체를 다루는데 필요한 메타데이터 만큼의 공간을 차지만(더 많은 메모리 필요)
    }
}
