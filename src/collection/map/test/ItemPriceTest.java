package collection.map.test;

import java.util.*;

//  Q : Map 에 들어있는 데이터 중에 값이 1000원인 모든 상품을 출력하라.
public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(1000)) {
                list.add(entry.getKey());
            }
        }

        System.out.println(list);
    }
}
