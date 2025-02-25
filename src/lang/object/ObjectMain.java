package lang.object;

public class ObjectMain {
    //    자바에서 모든 객체의 최종 부모틑 Object 이다.
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //  toString() 은 Object 클래스의 메서드
        //  toString() => 객체에 대한 정보를 출력
        String string = child.toString();
        System.out.println("string: " + string); // lang.object.Child@5f184fc6
    }
}
