package generic.example5;

// BOX 타입 생성
public class Box <T>{

    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
