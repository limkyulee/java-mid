package nested.test;

//  Q : Hello 인터페이스를 활용한 익명 클래스를 완성하라.
public class AnonymousMain {
    public static void main(String[] args) {
        Hello hello = new Hello(){

            @Override
            public void hello() {
                System.out.println("hello");
            }
        };

        hello.hello();
    }
}
