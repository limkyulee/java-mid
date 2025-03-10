package lang.wrapper.test;

public class WrapperTest2 {
//  Q : 배열에 입력된 모든 수의 합을 구하라. 숫자는 double 형이 입력될 수 있다.
    public static void main(String[] args) {
        String[] array = {"1.5", "2.0", "3.8"};

        double sum = 0;
        for(String s : array) {
            double d = Double.parseDouble(s);
            sum += d;
        }

        System.out.println("sum = " + sum);
    }
}
