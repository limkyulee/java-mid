package lang.immutable.address;

// 불변 객체 : 객체의 상태가 변하지 않는 객체
// 생성자를 통해서만 값을 셋팅할 수 있고 그 이후로는 값을 변경하는 것이 불가하다.
// setvalue 가 필요없음.

public class ImmutableAddress {
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
