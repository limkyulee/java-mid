package generic.example1;

//  FIXME : Generic Class
/**
 *
 * T 에는 기본형을 제외한 원하는 타입을 모두 지정할 수 있다. (객체 참조형만 가능)
 * @param <T> 타입 매개변수
 */
public class GenericBox<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
