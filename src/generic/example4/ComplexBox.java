package generic.example4;

import generic.animal.Animal;

//  FIXME : 제네릭 타입과 제네릭 메서드의 우선순위
//    Q : 제네릭 타입과 제네릭 메서드의 이름이 같아면?
//    A : 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가짐.
//  PLUS : 최대한 모호한 고민을 하지 않기 위해 두 이름을 다르게 설정하는 것이 좋음.
public class ComplexBox <T extends Animal>{

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

//  PLUS : T 는 상한이 없기 때문에 Object 타입으로 인식되어
//         Animal 에서 사용 가능한 기능을 사용할 수 없음.
    public <T> T printAndReturn(T t){
        System.out.println("animal Classname : " + animal.getClass().getName());
        System.out.println("t.className : " + t.getClass().getName());

        return t;
    };
}
