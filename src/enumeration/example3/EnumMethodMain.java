package enumeration.example3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

//      모든 ENUM 반한
        Grade[] values = Grade.values();
//      Arrays.toString() : 배열의 내부 값을 출력.
        System.out.println("values : " + Arrays.toString(values));

//      .name() : 값의 이름을 출력.
//      .ordinal() : 값의 순서를 출력. | 사용을 권장하지 않음.
        for (Grade grade : values) {
            System.out.println("Grade : " + grade.name() + " : " + grade.ordinal());
        }

//      String => ENUM 변환. 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("Golds : " + gold);
    }
}


