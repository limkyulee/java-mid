package lang.String.test;

public class TestString4 {
//  Q : substring() 을 사용하여 hello 부분과 .txt 부분을 분리하라.
    public static void main(String[] args) {
        String str = "hello.txt";
        String fileName = str.substring(0,5);
        String extName = str.substring(5);
        System.out.println(fileName);
        System.out.println(extName);
    }
}
