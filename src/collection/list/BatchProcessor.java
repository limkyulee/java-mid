package collection.list;

/**
 * 전략 패턴 (Strategy Pattern)
 * 알고리즘을 클라이언트 코드의 변경 없이 쉽게 교체할 수 있음.
 * `> 즉, 아래 관계에서 전략을 클라이언트코드(BatchProcessor) 의 변경 없이 손쉽게 교체 가능.
 * 클라이언트 : BatchProcessor
 * 전략 정의: MyList 인터페이스
 * 전략의 구현체 : MyArrayList, MyLinkedList
 */

//  FIXME : 추상적인 MyList 인터페이스에 의존하는 BatchProcessor 구현.
public class BatchProcessor {
    private final MyList<Integer> list;

//  PLUS : 의존관계 주입
//    > BatchProcessor 의 외부에서 의존관계가 결정되어 인스턴스에 들어오는 것 처럼 보임.
//    > 의존관계가 외붸서 주입되는 것 같음을 의미.

//  PLUS : 생성자 의존관계 주입
//    > 생성자를 통해서 의존관계를 주입.
//    > 생성자를 통해 MyList 구현체 전달. (MyArrayList  or MyLinkedList)
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

//  매우 복잡한 비즈니스 로직을 다룬다고 가정.
    public void logic(int size){
        long start = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
//          list 의 맨 앞부분에 데이터 추가
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", runtime: " + (end - start) + "ms");
    }
}
