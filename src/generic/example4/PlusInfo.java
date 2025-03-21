package generic.example4;
public class PlusInfo {}

//  PLUS :
//  generic 메서드는 인스턴스 메서드와 static 메서드에 모두 적용 가능.

/**
 * class Box<T> { // 제네릭 타입
 *  static <V> V staticMethod2(V t) {} // static 메서드에 제네릭 메서드 도입
 *  <Z> Z instanceMethod2(Z z) {} // 인스턴스 메서드에 제네릭 메서드 도입 가능
 * }
 */

//  PLUS :
//  generic 타입을 static 메서드에 사용 불가.
//    > generic 타입은 메서드를 객체를 생성하는 시점에 타입이 정해짐.
//    > static 메서드는 인스턴스 단위가 아니라 클래스 단위로 동작.
//    > (staticMethod1 메서드가 객체 없이 호출될 수 있음. -> generic 선언 전에 사용될 수 있음)
//    > generic 타입과 무관.
//    > 본인만의 generic 타입을 선언하는 generic 메서드를 만들어야 함.

/**
 * class Box<T> {
 *  T instanceMethod(T t) {} // 가능
 *  static T staticMethod1(T t) {} // 제네릭 타입의 T 사용 불가능
 * }
 */

