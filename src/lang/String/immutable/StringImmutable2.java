package lang.String.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = str1.concat(" java");

//        String 은 불변객체이기 때문에 기존값의 변경이 있을 경우 새로운 결과를 만들어 반환한다.
        System.out.println(str1);
        System.out.println(str2);

//        String 클래스가 불변으로 설계된 이유 :
//        String 은 자바 내부에서 문자열 풀을 통해 최적화한다.
//        > 기존 값을 변경할 수 있게되면 참조하고 있는 다른 변수들에 대한 값도 같이 변경될 수 있기 때문에
//        > 불변으로 설계하여 사이드 이펙트를 막는다.
    }
}
