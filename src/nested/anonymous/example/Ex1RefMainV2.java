package nested.anonymous.example;

import java.util.Random;

public class Ex1RefMainV2 {

    public static void helloPrint(Process process){
        System.out.println("프로그램 시작");

//      코드 조각 시작
        process.run();
//      코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
//      REFACTOR : main 메서드 안에서 Dice 코드 조각 생성 | 지역 클래스
        class Dice implements Process{

            @Override
            public void run() {
                int randomVal = new Random().nextInt(6) + 1;
                System.out.println("주사위 : " + randomVal);
            }
        }

//      REFACTOR : main 메서드 안에서 Sum 코드 조각 생성 | 지역 클래스
        class Sum implements Process{

            @Override
            public void run() {
                for(int i = 1; i < 3; i++){
                    System.out.println("i : " + i);
                }
            }
        }

        Process dice = new Dice();
        Process sum = new Sum();

        helloPrint(dice);
        helloPrint(sum);
    }
}
