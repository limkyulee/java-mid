package generic.example3;

//  REFACTOR : generic 을 도입하여 코드 재사용성 늘리고, 타입 안정성 해결.
//  LIMIT : T의 타입을 메서드를 정의하는 시점에는 알 수 없어
//            Animal 에 대한 정보를 가지고있지 않아 원하는 기능을 사용할 수 없음.
public class AnimalHospitalV2<T> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup(){
//      LIMIT :
//        > T의 타입을 메서드를 정의하는 시점에는 알 수 없음.
//        > Object 의 기능만 사용 가능.
//      RESULT : 컴파일 오류 발생.
//        System.out.println("동물 이름 : " + animal.getName());
//        System.out.println("동물 크기 : " + animal.getSize());
//        animal.sound();
    }

    public T bigger(T target){
//      RESULT : 컴파일 오류
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
