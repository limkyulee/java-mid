package collection.list.test.example1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> students = new ArrayList<>();
        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(40);

        int total = 0;

//      FIXME : 내가 작성한 코드
//        for (Integer student : students) {
//            total += student;
//        }

//      FIXME : 정답 코드
        for(int i = 0; i < students.size(); i++){
            total += students.get(i);
        }

        double average = (double) total / students.size();
        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평규 : " + average);
    }

}
