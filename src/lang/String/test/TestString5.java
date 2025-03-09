package lang.String.test;

public class TestString5 {
//  Q : str 에는 파일의 이름과 확장자가 주어진다. ext 에는 파일의 확장자가 주어진다.
//  indexOf 와 substring 을 사용하여 파일명과 확장자를 분리해서 출력하라.
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extStartIdx = str.indexOf(ext);
        String fileName = str.substring(0,extStartIdx);
        String extName = str.substring(extStartIdx);

        System.out.println("fileName : " + fileName);
        System.out.println("extName : " + extName);
//        System.out.println("ext : " + ext);
    }
}
