package collection.list.test.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n 개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int n = scanner.nextInt();
            if(n == 0) break;
            list.add(n);
        }

        System.out.println("출력");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i != list.size() - 1) {
                System.out.print(", ");
            }
        }

    }
}
