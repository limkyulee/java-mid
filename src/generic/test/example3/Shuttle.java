package generic.test.example3;

import generic.test.example3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {

    private T item;

    public void in(T bioUnt) {
        this.item = bioUnt;
    }

    public void showInfo() {
        System.out.println("이름 : " + item.getName() + ", HP: " + item.getHp());
    }

    public T out() {
        return item;
    }
}
