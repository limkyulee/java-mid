package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

//      숫자를 입력 하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자1");
        System.out.println(numberList);

//      LIMIT : Object 를 반환하므로 다운캐스팅 필요.
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

//      LIMIT : 문자를 Integer 로 캐스팅 | ClassCastException 발생.
        Integer num3 = (Integer) numberList.get(2);

//      >> 제네릭을 사용하여 위 문제 해결. | MyArrayListV4
    }
}
