package nested.anonymous.example;

import java.util.Random;

public class Ex1RefMainV1{

//  Dice 코드 조각 생성
    static class Dice implements Process{

        @Override
        public void run() {
            int randomVal = new Random().nextInt(6) + 1;
            System.out.println("주사위 : " + randomVal);
        }
    }

//  Sum 코드 조각 생성
    static class Sum implements Process{

        @Override
        public void run() {
            for(int i = 1; i < 3; i++){
                System.out.println("i : " + i);
            }
        }
    }

//  REFACTOR : helloPrint 함수를 재사용할 수 있도록 로직 수정.
//    > Process 인스턴스를 인수로 전달.
//    > 해당 인스턴스 구현체에 정의된 메서드를 실행.
//    > 외부에서 전달되는 인스턴스에 따라 각각 다른 코드 조각이 실행됨.
    public static void helloPrint(Process process){
        System.out.println("프로그램 시작");

//      코드 조각 시작
        process.run();
//      코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloPrint(new Dice());
        helloPrint(new Sum());
    }
}
