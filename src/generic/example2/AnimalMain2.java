package generic.example2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

//      PLUS : Generic(제네릭) 이라고 하더라도 부모 타입을 지정하면 자식 타입의 값도 대입 가능하다.
        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);
//      마지막에 들어간 고양이가 출력됨.
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal: " + findAnimal);
    }
}
