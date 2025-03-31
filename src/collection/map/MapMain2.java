package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

//      학샐 성적 데이터 추가
        studentMap.put("A", 90);
        System.out.println(studentMap);

//      PLUS : 같은 키로 저장할 경우, 기존 값이 교체됨.
        studentMap.put("A", 100);
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("A");
        System.out.println(containsKey);

//      특정 학생 값 삭제
        studentMap.remove("A");
        System.out.println(studentMap);
    }
}
