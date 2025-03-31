package collection.map;

import java.util.*;

/**
 * 0. Set 과 Map
 *    - Set 과 Map 의 구현체는 거의 같음.
 *    - Map 에서 Value 만 비워두면 Set 으로 사용 가능.

 * 1. HashMap
 *    - 구조 : 해시를 사용하여 요소를 저장. key 값은 해시 함수를 통해 해시 코드로 변환 (value 는 관여하지않음),
 *            변환된 해시 코드는 데이터를 저장하고 검색하는데 사용됨.
 *    - 특징 : 삽입, 삭제, 검색 작업은 해시 자료 구조를 사용하므로 O(1) 의 복잡도를 가짐.
 *    - 순서 : 순서를 보장하지 않음.
 * 2. LinkedHashMap
 *    - 구조 : 연결 리스트를 사용하여 삽입 순서 또는 최근 접근 순서에 따라 요소를 유지함.
 *    - 특징 : 입력 순서에 따라 순회 가능. HashMap 과 같지만 입력 순서를 링크로 유지해야하므로 조금 더 무거움.
 *    - 성능 : HashMap 과 유사하게 대부분의 작업은 O(1) 의 복잡도를 가잠.
 *    - 순서 : 입력 순서를 보장함.
 * 3. TreeMap
 *    - 구조 : 레드 - 블랙 트리를 기반으로 구현됨.
 *    - 특징 : 모든 키는 자연 순서 또느 생성자에 제공된 Comparator 에 의해 정렬됨.
 *    - 성능 : get, put, remove 와 같은 주요 작업들은 O(log n) 의 복잡도를 가짐.
 *    - 순서 : 키는 정렬된 술서로 저장됨.

 * HashTable
 * 해시를 사용해서 키와 값을 저장하는 자료구조,
 */

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map : " + map);
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySets = map.keySet();
        Iterator<String> iterator = keySets.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.print(key + "=" + value + " ");
        }
        System.out.println();
    }
}
