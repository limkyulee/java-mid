package lang.system;

import java.util.Arrays;

// system 클래스는 시스템과 관련된 기본 기능을 제공함.
public class SystemMain {
    public static void main(String[] args) {
//      현재 시간을(밀리초) 가져온다.
        long currentTimeMiils = System.currentTimeMillis();
        System.out.println("currentTimeMiils : " + currentTimeMiils);

//      현재 시간을(나노초) 가져온다.
        long currentTimeNanos = System.nanoTime();
        System.out.println("currentTimeNanos : " + currentTimeNanos);

//      환경 변수를 읽는다.
        System.out.println("getenvs = " + System.getenv()); // OS 에서 설정한 환경변수의 값을 얻을 수 있음.

//      시스템 속성을 읽는다.
        System.out.println("props = " + System.getProperties()); // 자바와 관련된 설정을 얻을 수 있음.
        System.out.println("Java version = " + System.getProperty("java.version"));

//      배열을 고속으로 복사한다.
        char[] originalArray = {'a', 'b', 'c', 'd', 'e'};
        char[] copiedArray = new char[5];
//      배열의 복사를 운영체제나 하드웨어 레벨로 기능을 던짐.
//      배열을 통체로 복사 > 속도가 굉장히 빠름.
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

//      배열 출력.
        System.out.println("originalArray : " + originalArray);
        System.out.println("copiedArray : " + copiedArray);
        System.out.println("Array.toString : " + Arrays.toString(copiedArray));

//      프로그램 종료. (권장하지않음 : 웹 애플리케이션 개발 시, 사용 금지.)
//      > 상태코드 0 : 정상 종료
//      > 상태코드 0 이 아님 : 오류나 예외적인 종료
        System.exit(0);
//        System.out.println("hello"); // 위에서 프로그램이 종료되었기 때문에 실행될 수 없다.
    }
}
