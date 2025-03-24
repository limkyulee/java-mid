package collection.array;

//  REFACTOR : 제네릭을 사용하도록 로직 수정
//    > 타입 인자로 지정한 타입으로만 안전하게 데이터를 저장 및 조회할 수 있음.
public class MyArrayListV4Main {
    public static void main(String[] args) {

        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        String string = stringList.get(0);
        System.out.println("string : " + string);

        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        Integer integer = integerList.get(0);
        System.out.println("integer : " + integer);
    }
}
