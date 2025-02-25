package lang.object.toString;

// 1. 다형적 참조 > Object 타입을 매개변수로 사용해서 세상의 모든 객체 인스턴스를 인수로 받을 수 있다.
// 2. 메서드 오버라이딩 > 부모 타입인 Object 의 toString 을 호출 하다가도, 런타임에 각 인스턴스의 toString(오버라이딩 된 함수) 을 호출할 수 있다.
public class ObjectPrinter {
    public static void print(Object obj) {
        String string = "객체 정보 출력 : " + obj.toString();
        System.out.println(string);
    }
}
