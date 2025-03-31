package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map
 * 키-값의 쌍을 저장하는 자료구조.
 * 키는 맵 내에서 유일해야함.
 * 키를 통해 값을 빠르게 검색할 수 있음.
 * 순서를 유지하지 않음.
 * HashMap, TreeMap, LinkedHashMap 등 다양한 Map 구현체를 제공.
 */
public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

//      학생 성적 데이터 추가.
        studentMap.put("A", 90);
        studentMap.put("B", 80);
        studentMap.put("C", 80);
        studentMap.put("D", 100);
//      PLUS : 입력한 순서대로 출력되지 안흥ㄹ 수 있음. (순서를 유지하지않음)
        System.out.println("studentMap : " + studentMap);

//      특정 학생 값 조회
        Integer result = studentMap.get("A");
        System.out.println("result : " + result);

        System.out.println("ketSet 활용");
//      PLUS : Key 는 중복되면 안되고, 순서를 보장하지않기 때문에 Set 으로 반환.
        Set<String> ketSet = studentMap.keySet();

        for (String key : ketSet) {
            Integer value = studentMap.get(key);
            System.out.println("key : " + key + " value : " + value);
        }

        System.out.println("entrySet 활용");
//      PLUS : entry | key-value 의 쌍으로 이루어진 간단한 객체.
//           : Map 내부에서 키와 값을 함께 묶어서 저장할 때 사용. (Map 내부 인터페이스)
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key : " + key + " value : " + value);
        }

        System.out.println("values 활용");
//      PLUS : 중복이 될 수 있기 때문에 Collection 으로 반환. (중복을 허용하지않는 Set 으로는 반환 불가.)
//           : List 는 순서가 보장되어야하기 떄문에 List 로는 반환하지 않고 그 상위타입인 Collection 으로 반환.
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value : " + value);
        }
    }
}
