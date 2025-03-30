package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
//      기본 생성자를 사용하지않고 배열의 크기를 10으로 설정.
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); // hashIndex 중복
        System.out.println(set);

//      검색
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("result : " + result);

//      삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("remove result : " + removeResult);
        System.out.println("set : " + set);
    }
}
