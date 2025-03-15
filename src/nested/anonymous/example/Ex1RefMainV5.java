package nested.anonymous.example;

import java.util.Random;

public class Ex1RefMainV5 {

    public static void helloPrint(Process process){
        System.out.println("프로그램 시작");

//      코드 조각 시작
        process.run();
//      코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
//      REFACTOR : 익명 클래스 > 람다 사용 로직으로 수정.
//        > 람다는 익명 클래스에서 선언 가능한 멤버 변수는 선언할 수 없다는 차이점이 있음.
        helloPrint(() -> {
            int randomVal = new Random().nextInt(6) + 1;
            System.out.println("주사위 : " + randomVal);
        });
        helloPrint(() -> {
            for(int i = 1; i < 3; i++){
                System.out.println("i : " + i);
            }
        });
    }
}
