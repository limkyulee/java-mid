package nested.inner.example2;

//  보완 요구 사항 : Engine 을 Car 내부 클래스로 만들기.
//              : 엔진은 차의 충전 레벨과 모델 명에 접근해야함.
public class Car {
    private final String model;
    private final int chargeLevel;
    private final Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
//      PLUS : new Engine()
//        > 인스턴스를 생성할 때 Car 에 대한 인스턴스 정보를 알게됨.
//        > 바깥 클래스의 참조 정보를 알 수 있음.
        this.engine = new Engine();
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }

//  내부 클래스
//    REFACTOR : Car 의 인스턴스 변수인 chargeLevel, model 에 직접 접근 가능.
    private class Engine {
        public void start(){
            System.out.println("충전 레벨 확인 :  " + chargeLevel);
            System.out.println(model + " 의 엔진을 구동합니다.");
        }
    }
}
