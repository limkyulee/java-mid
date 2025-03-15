package nested.anonymous.example;

import java.util.Random;

public class Ex1RefMainV4 {

    public static void helloPrint(Process process){
        System.out.println("프로그램 시작");

//      코드 조각 시작
        process.run();
//      코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
//      REFACTOR : 익명 클래스를 인수 전달하는 방식으로 로직 변경.
//        > 굳이 참조값을 담아놓지않고 바로 인수로 전달.
//        > 자바에서는 메서드만 넘길 수 있는 방법이 없음.
//        > 메서드에 인수로 전달할 수 있는 것은 간단한 데이터나, 인스턴스의 참조 뿐.
//        > Q : 그렇다면 클래스나 인스턴스와 관계 없이 메서드만 전달할 수 있는 방법이 아예 없을까?
//          A : 람다(Lamda) 의 사용.

        helloPrint(new Process(){

            @Override
            public void run() {
                int randomVal = new Random().nextInt(6) + 1;
                System.out.println("주사위 : " + randomVal);
            }
        });
        helloPrint(new Process() {

            @Override
            public void run() {
                for(int i = 1; i < 3; i++){
                    System.out.println("i : " + i);
                }
            }
        });
    }
}
