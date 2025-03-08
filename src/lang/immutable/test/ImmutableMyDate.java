package lang.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

//  정의 : 불변객체를 변경하기 위해서는 변경하고자하는 계산값으로 새로운 객체를 생성하여 반환하면 된다.
//  불변객체에서 값을 변경할 때, 함수명이 "with" 로 시작하는 경우가 많다.
//  관례 : "with" > 원본 객체의 상태가 그대로 유지됨을 강조하면서 변경사항을 새 복사본에 포함하는 과정을 간결히 표현.

    public ImmutableMyDate withYear(int year) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate withMonth(int month) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate withDay(int day) {
        return new ImmutableMyDate(year, month, day);
    }

    @Override
    public String toString() {
        return "ImmutableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
