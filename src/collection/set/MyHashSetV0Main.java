package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);

        boolean result = set.add(4); // 중복 데이터 저장 테스트
        System.out.println("중복 데이터 저장 결과 : " + result);
        System.out.println(set);

//      PLUS :
//      O(n) : contains 로 데이터를 찾는 일은 for 문을 전체 돌면서 값을 찾아야하기 때문.
//          > 결국 데이터를 찾는 부분에서 성능이 떨어짐.
//      Q : 해당 문제를 해결할 수 있는 방법은?
//      A : 해시(hash) 알고리즘.
        System.out.println("set.contains(3) = " + set.contains(3)); // O(n)
        System.out.println("set.contains(99) = " + set.contains(99)); // O(n)
    }
}
