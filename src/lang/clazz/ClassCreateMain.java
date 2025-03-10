package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
//        Class helloClass = Class.forName("lang.clazz.Hello");

//      코드 해석 : Hello 클래스를 가진 생성자를 얻어서 객체를 생성함.
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();

        System.out.println("Hello : " + hello);
        System.out.println("result : " + result);
    }
}
