package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData = new int[10];
    private int size;

    // O(n)
    public boolean add(int value) {
        if(contains(value)) {
            return false;
        }

        elementData[size++] = value;
        return true;
    }

    public boolean contains(int value) {
        for(int data : elementData) {
            if(data == value) {
                return true;
            }
        }

        return false;
    }

    public int getSize(){
        return size;
    }

//  Arrays.toString(Arrays.copyOf(elementData,size)) : Array 의 size 만큼만 복사하여 출력.
    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData,size)) +
                ", size=" + size +
                '}';
    }
}
