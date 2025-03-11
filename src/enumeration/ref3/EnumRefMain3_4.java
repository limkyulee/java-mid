package enumeration.ref3;

public class EnumRefMain3_4 {

//  REFACTOR : Grade 의 값에 변화가 생기더라도 모든 등급의 할인율을 출력할 수 있도록 로직 수정.
    public static void main(String[] args) {
        int price = 10000;

        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + " " + price + " " + grade.discount(price));
    }
}
