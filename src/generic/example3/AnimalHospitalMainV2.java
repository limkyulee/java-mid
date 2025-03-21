package generic.example3;

import generic.animal.Cat;
import generic.animal.Dog;

// LIMIT : 타입 매개변수를 Animal 로 제한하지 않음
//    > 어떤 타입이든 수용 가능하여 Object 의 기능만 사용할 수 있게 됨.
public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}
