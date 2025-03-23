package generic.example5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain2 {
    public static void main(String[] args) {

        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

//      PLUS : super
//        > Animal 포함 상위 타입 전달 가능
//        > "?" 는 자기자신 또는 그 보다 위에 있어야함.
//        > 하한은 제네릭 타입에서는 사용할 수 없음. (와일드카드에만 존재하는 개념)
        writeBox(objectBox);
        writeBox(animalBox);
//        writeBox(dogBox); // 하한이 Animal
//        writeBox(catBox); // 하한이 Animal

        Animal animal = animalBox.get();
        System.out.println("Animal : " + animal);
    }

    static void writeBox(Box<? super Animal> box){
        box.set(new Dog("멍멍이", 100));
    }
}
