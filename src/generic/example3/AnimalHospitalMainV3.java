package generic.example3;

import generic.animal.Cat;
import generic.animal.Dog;

//  REFACTOR : 제네릭에 타입 매개변수 상한을 사용.
//    > 타입 안정성 유지, 타입이 원하는 기능 사용 가능(코드 재사용성 증가).
public class AnimalHospitalMainV3 {
    public static void main(String[] args) {

        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

//        REFACTOR : extends 한 타입 또는 그 하위 타입이 아닌 경우 컴파일 오류 발생.
//        AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        catHospital.setAnimal(cat);
        catHospital.checkup();

//      DO : dogHospital 에 Cat 전달
//      REFACTOR : 다른 타입 입력을 감지하여 컴파일 오류 발생.
//        dogHospital.setAnimal(cat);

//      REFACTOR : 타입 다운캐스팅을 필요로 하지 않음.
        dogHospital.setAnimal(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog : " + biggerDog);
    }
}
