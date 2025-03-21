package generic.example3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

// REFACTOR : 다향성을 사용하여 중복 로직 제거.
// CONS : 타입 안정성 감소.
// PROS : 코드 재사용성 증가.
public class AnimalHospitalMainV1 {
    public static void main(String[] args) {

        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        catHospital.setAnimal(cat);
        catHospital.checkup();

//      DO : dogHospital 에 Cat 전달
//      LIMIT : 매개변수 체크 실패 | 컴파일 오류가 발생하지 않음.
        dogHospital.setAnimal(cat);

//      LIMIT : Dog 타입을 반환하기 위해서는 다운 캐스팅 필요.
        dogHospital.setAnimal(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog : " + biggerDog);
    }
}
