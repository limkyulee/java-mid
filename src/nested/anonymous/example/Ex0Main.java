package nested.anonymous.example;

public class Ex0Main {

    public static void helloJava(){
        System.out.println("프로그램 시작"); // 변하지 않는 부붑
        System.out.println("Hello Java"); // 변하는 부분
        System.out.println("프로그램 종료"); // 변하지 않는 부붑
    }

    public static void helloSpring(){
        System.out.println("프로그램 시작"); // 변하지 않는 부붑
        System.out.println("Hello Spring"); // 변하는 부분
        System.out.println("프로그램 종료"); // 변하지 않는 부붑
    }

//  REFACTOR : helloJava + helloSpring
//     > 변하지 않는 부분과 변하는 부분 분리.
    public static void helloPrint() {
        System.out.println("프로그램 시작"); //변하지 않는 부분

//      REFACTOR : 변하는 부분에 대한 값만 외부에서 전달받아 출력.
//        > 변하는 부분을 내부에서 가지고 있는 것이 아니라 외부로 분리한다는 것이 재사용성의 핵심.
//      변하는 부분 시작
        System.out.println("Hello Java");
        System.out.println("Hello Spring");
//      변하는 부분 종료

        System.out.println("프로그램 종료"); //변하지 않는 부분
    }

    public static void main(String[] args) {
        helloJava();
        helloSpring();
    }
}
