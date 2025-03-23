package generic.example1;

public class RowTypeMain {
    public static void main(String[] args) {
//        GenericBox<Object> objectGenericBox = new GenericBox<>(); // 권장 포멧

//      FIXME : 제네릭 타입 사용 시, 주의할 점.
//        > 아래와 같이 "<>" 를 지정하지 않을 수 있는데
        GenericBox integer = new GenericBox();
        integer.set(10);
        Integer result = (Integer) integer.get();
    }
}
