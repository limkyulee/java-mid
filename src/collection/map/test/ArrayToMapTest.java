package collection.map.test;

import java.util.HashMap;
import java.util.Map;

//  Q : 상품의 이름과 가격이 2차원 배열로 제공된다.
//    : 다음 예제를 참고해서 2차원 배열의 데이터를 Map<String, Integer> 로 변경하라.
public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JAP", "30000"}};

//      주어진 배열로부터 Map 생성.
        Map<String, Integer> map = new HashMap<>();
        for(String[] product : productArr) {
            map.put(product[0], Integer.parseInt(product[1]));
        }

//      Map 모든 데이터 출력.
//        FIXME : 정답 코드 | keySet 사용.
        for(String key : map.keySet()) {
            System.out.println("제품 : " + key + ", 가격 : " + map.get(key));
        }
//        FIXME : 내가 작성한 코드 | entry 사용.
//        for(Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("제품 : " + entry.getKey() + ", 가격 : " + entry.getValue());
//        }
    }
}
