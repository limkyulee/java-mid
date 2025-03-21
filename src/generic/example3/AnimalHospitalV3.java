package generic.example3;

import generic.animal.Animal;

//  REFACTOR : 타입 인자가 받을 수 있는 타입의 범위를 제한 (Animal 로 제한)
//      > T 를 Animal 과 그 자식으로 제한함.
//      > Animal 클래스가 가지고 있는 기능을 사용할 수 있음을 인식함.
public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
