package generic.example5;

import generic.animal.Animal;

//  FIXME : 제네릭 타입이나 제네릭 메서드를 정의하는게 꼭 필요한 상황이 아니라면,
//          단순한 와일드카드 사용을 권장함.
public class WildcardEx {

//  ===== Generic =====
//  제네릭 메서드
//     > 타입 추론에 의해 T 가 넘어온 타입이 됨.
    static <T> void printGenericV1(Box<T> box){
        System.out.println("T : " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 : " + t.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t = box.get();
        System.out.println("이름 : " + t.getName());
        return t;
    }

//  ===== Wildcard =====
//  ? : Box<Dog>, Box<Cat>, Box<Object> ...

//  제네릭 메서드가 아님. | 비제한 와일드 카드
//    > 일반적인 메서드 이지만 와일드카드 "?" 는 모든 타입을 받을 수 있음.
//    > 모든 타입을 다 받을 수 있다. | <? extends Object>
    static void printWildcardV1(Box<?> box){
        System.out.println("? : " + box.get());
    }

    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 : " + animal.getName());
    }

    static Animal printAndReturnWildcard (Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 : " + animal.getName());

        return animal;
    }
}
