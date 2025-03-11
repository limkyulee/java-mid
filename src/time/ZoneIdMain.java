package time;

import java.time.ZoneId;

public class ZoneIdMain {
//   PLUS : ZoneId 는 내부에 일광 절약 시간 관련 정보, UTC와의 오프셋 정보를 포함.
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println("Available ZoneId: " + zoneId + "| " + zoneId.getRules());
        }

//      ZoneId.systemDefault() : 시스템이 사용하는 기본 ZoneId() 반환.
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("System Default ZoneId: " + zoneId + "| " + zoneId.getRules());

//      ZoneId.of() : 타임존을 직접 제공해서 ZoneId 를 반환.
        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId: " + seoulZoneId + "| " + seoulZoneId.getRules());
    }
}
