package lang.object;

// 명시적으로 부모 클래스를 상속 받으면, Object 를 상속받지않는다.
public class Child extends Parent{

    public void childMethod(){
        System.out.println("Child childMethod");
    }
}
