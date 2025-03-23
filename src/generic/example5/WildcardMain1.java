package generic.example5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {

        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox= new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 200));

        WildcardEx.<Dog>printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

//      제네릭 메서드는 전달한 타입을 명확하게 반환할 수 있음.
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

        catBox.set(new Cat("야옹이", 100));
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

//      와잁드 카드의 경우 전달한 타입을 명확하게 반환할 수 없음.
//        > 어쩔 수 없는 다운캐스팅 필요.
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
        System.out.println("animal : " + animal);

    }
}
