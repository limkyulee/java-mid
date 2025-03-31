package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

//      학샐 성적 데이터 추가
        studentMap.put("A", 50);
        System.out.println(studentMap);

//      학생이 없는 경우에만 추가 - 1
        if(!studentMap.containsKey("A")) {
            studentMap.put("A", 100);
        }

        System.out.println(studentMap);

//      학생이 없는 경우에만 추가 - 2
//      PLUS : putIfAbsent | 키가 없는 경우에만 데이터를 저장하고 싶을 때, 코드 한 줄로 편리하게 처리 가능.
        studentMap.putIfAbsent("A", 100);
        studentMap.putIfAbsent("B", 100);
        System.out.println(studentMap);
    }
}
