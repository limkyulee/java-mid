package generic.example4;

public class GenericMethod {
    public static Object objMethod(Object obj){
        System.out.println("obj Method : " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){
        System.out.println("generic Method : " + t);
        return t;
    }

//  PLUS : 제네릭 메서드도 제네릭 타입과 마찬가지로 타입 매개변수를 제한 가능.
    public static <T extends Number> T numberMethod(T t){
        System.out.println("bound Method : " + t);
        return t;
    }
}
