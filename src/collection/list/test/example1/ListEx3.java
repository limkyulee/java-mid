package collection.list.test.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if(n == 0) break;
            list.add(n);
        }

        int total = 0;
        for(Integer i : list) {
            total += i;
        }

        double average = (double) total / list.size();

        System.out.println("입력한 정수의 합계 : " + total);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
