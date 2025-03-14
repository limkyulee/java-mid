package nested.anonymous.example;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void helloPrint(Process process){
        System.out.println("프로그램 시작");

//      코드 조각 시작
        process.run();
//      코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
//      REFACTOR : 지역 클래스 > 익명 클래스 선언하여 사용하는 것으로 로직 변경.
       Process dice = new Process(){

            @Override
            public void run() {
                int randomVal = new Random().nextInt(6) + 1;
                System.out.println("주사위 : " + randomVal);
            }
        };

        Process sum = new Process() {

            @Override
            public void run() {
                for(int i = 1; i < 3; i++){
                    System.out.println("i : " + i);
                }
            }
        };

        helloPrint(dice);
        helloPrint(sum);
    }
}
