package generic.example3;

import generic.animal.Cat;
import generic.animal.Dog;

//  CONS : 코드 재사용 불가
//  PROS : 타입 안정성 제공
public class AnimalHospitalMainV0 {
    public static void main(String[] args) {

        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        catHospital.setAnimal(cat);
        catHospital.checkup();

//      DO : dogHospital 에 Cat 전달
//      LIMIT : 타입 컴파일 오류 발생
//        dogHospital.setAnimal(cat);

        dogHospital.setAnimal(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog : " + biggerDog);
    }
}
