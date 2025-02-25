package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();

//        Object 는 모든 객체의 부모이기 때문에, 선언을 할 수는 있다.
//        Object o = dog;

        action(dog);
        action(car);
    }

    private static void action(Object obj){
//        obj.sound(); // 컴파일 오류 발생 : Object 는 sound()를 가지고 있지 않음.
//        obj.move(); // 컴파일 오류 발생 : Object 는 move()를 가지고 있지 않음.

//        객체에 맞는 다운 캐스팅 필요 (타입 옆에 선언 해주면 자동으로 다운 캐스팅 가능)
        if(obj instanceof Dog dog){
            dog.sound();
        }else if(obj instanceof Car car){
            car.move();
        }
    }
}
