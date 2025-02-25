package lang.object.toString;

public class toStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

//      toString 반환값 출력
        System.out.println(string);
//      Object 직접 출력
        System.out.println(object);

//      `System.out.println()` 메서드는 사실 내부에서 `toString()` 을 호출한다.
//      > toString 과 Object 를 그냥 출력할 때 동일한 값이 나오는 이유.

    }
}
