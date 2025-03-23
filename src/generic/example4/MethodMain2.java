package generic.example4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog("명명이", 100);
        Cat cat = new Cat("냐옹이", 100);

//      매개변수 추론 : <T> 삭제 가능
        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 300);

//        LIMIT : 다른 타입 사용 시, 타입 추론에 문제 발생
//        Dog biggerDog = AnimalMethod.bigger(dog, cat);

        Dog biggerDog = AnimalMethod.bigger(dog, targetDog);
        System.out.println("biggerDog : " + biggerDog);


    }
}
