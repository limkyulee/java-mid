package generic.example5;

public class EraserBox <T>{

//  PLUS : java 는 타입 매개변수의 instanceof 를 허용하지 않음.
//    > 타입 이레이저 때문에, T 는 런타임 시점에 모두 Object 가 됨.
//    > 때문에 instanceof 는 항상 Object 와 비교하게 되어 항상 "true" 를 반환.
    public boolean instanceCheck(Object param){
//        컴파일 오류 발생.
//        return param instanceof T;

        return false;
    }

//  PLUS : java 는 타입 매개변수에 new 를 허용하지 않음.
//    > 타입 이레이저 때문에, T 는 런타임 시점에 모두 Object 가 됨.
//    > 때문에 new T 는 항상 new Object 가 됨.
    public T create(){
//        컴파일 오류 발생.
//        return new T();

        return null;
    }
}
