package collection.link;

//  REFACTOR : 제네릭 타입을 사용
//      > 타입 안정성 있는 자료구조를 만들 수 있음.
public class MyLinkedListV3Main {
    public static void main(String[] args) {

        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string : " + string);

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer : " + integer);
    }
}
