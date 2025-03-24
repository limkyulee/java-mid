package collection.link;

/**
 * PLUS : 배열 리스트 VS 단일 연결 리스트 (자바가 제공하는 연결 리스트는 이중 연결 리스트)

 *      기능      |    배열리스트   |   연결리스트
 * 인덱스 조회             O(1)          O(n)
 * 검색                   O(n)          O(n)
 * 앞에 추가(삭제)         O(n)          O(1)
 * 뒤에 추가(삭제)         O(1)          O(n)
 * 평균 추가(삭제)         O(n)          O(n)

 * 배열 리스트 추천
 *  > 데이터를 조회할 일이 많고, 뒷 부분에 데이터를 추가하는 경우
 * 연결 리스트 추천
 *  > 앞쪽의 데이터를 추가하거나 삭제할 일이 많은 경우
 */

public class MyLinkedListV2Main {
    public static void main(String[] args) {

        MyLinkedListV2 list = new MyLinkedListV2();

//      마자막에 추가 | 마지막을 찾아야하기 때문에 O(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

//      첫 번째 항목에 추가, 삭제
        System.out.println("첫 번째 항목에 추가");
        list.add(0,"d"); // 한번에 바로 추가하기 때문에 O(1)
        System.out.println(list);

        System.out.println("첫 번째 항목 삭제");
        list.remove(0); // remove fist | 한번에 바로 찾고 삭제하기 때문에 O(1)
        System.out.println(list);

//      중간 항목에 추가, 삭제
        System.out.println("중간 항목에 추가");
        list.add(1,"e"); // 인덱스의 위치를 찾아야하기 때문에 O(n)
        System.out.println(list);

        System.out.println("중간 항목 삭제");
        list.remove(1); // remove | 인덱스의 위치를 찾아야하기 때문에 O(n)
        System.out.println(list);
    }
}
