package collection.map.test;

import java.util.HashMap;
import java.util.Map;

//  Q : 각각의 단어가 나타난 수를 출력해라.
public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        String[] texts = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

//      FIXME : getOrDefault() 를 사용한 코드
//            : getOrDefault() | 키가 없는 경우 대신 사용할 기본 값을 지정할 수 있음.
        for(String str : texts) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

//        FIXME: 반복문을 사용한 코드
//        for(String str : texts) {
//            Integer count = map.get(str);
//            System.out.println("count >" + count + "\t" + str);
//            if(count == null) {
//                count = 0;
//            }
//
//            map.put(str, ++count);
//        }

        System.out.println(map);
    }
}
