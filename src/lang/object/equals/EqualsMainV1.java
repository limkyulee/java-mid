package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {

        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");
// Object 는 기본으로 동일성 비교를 제공한다.
//        동일성 비교 > 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인.
//        동등성 비교 > 두 객체가 논리적으로 동등한지 확인.

//       "==" 로 비교 > 동일성 비교 진행 > 두 변수의 참조값이 달라 다르다고 판단.
        System.out.println("identity : " + (userV1 == userV2));
//       "equals" 로 비교 > 동일성 비교 > 위와 같이 메모리 상을 기준으로 판단. > 두 변수의 참조값이 다름.
//        동등성 비교를 하기 위해서는 "equals" 를 메서드 오버라이딩하여 사용자 재정의 후 사용하면 된다.
        System.out.println("equals() : " + userV1.equals(userV2));
    }
}
