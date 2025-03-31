package collection.map.test;

import java.util.HashMap;
import java.util.Map;

//  Q : map1 과 map2 에 공통으로 들어있는 키를 찾고, 그 값의 합을 구해라.
public class CommonKeyValueSum1 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

//     FIXME :
//        PLUS : Map.of() 를 사용하면 편리하게 Map 을 생성하루 수 있음.
//             : 하지만 Map.of() 를 사용하여 생성한 Map 은 볼변이기 때문에 내용을 변경할 수 없음.
//        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
//        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

//     FIXME : 정답 코드.
        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) {
            if(map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(result);

//        FIXME : 내가 작성한 코드.
//        Set<String> keySet = map1.keySet();
//        Set<String> keySet2 = map2.keySet();
//
//        Set<String> keySet3 = new HashSet<>(keySet);
//        keySet3.retainAll(keySet2);
//
//        for (String key : keySet3) {
//            int sum = map1.get(key) + map2.get(key);
//            System.out.println(key + "=" + sum);
//        }

    }
}
