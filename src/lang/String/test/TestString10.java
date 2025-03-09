package lang.String.test;

public class TestString10 {
//  Q : split() 을 사용하여 fruits 를 분리하고, join() 을 사용해서 분리한 문자들을 하나로 합쳐라.
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruitsArray = fruits.split(",");

        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }

        String joinedStrings = String.join("->", fruitsArray);
        System.out.println(joinedStrings);
    }
}
