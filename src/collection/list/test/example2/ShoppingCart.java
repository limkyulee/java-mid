package collection.list.test.example2;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item1) {
        items.add(item1);
    }

//    FIXME : 내가 작성한 코드
//      REFACTOR : 상품 전체 가격을 계산하는 로직 분리.
//          > 상품을 출력해야하는 로직에 전체 가격을 계산하는 로직을 추가하는 것은 유지보수 관점에서 좋지않음.
//    public void displayItems() {
//        System.out.println("장바구니 상품 출력");
//        int allItemsTotal = 0;
//        for (Item item : items) {
//            System.out.println("상품명 : " + item.getName() + ", 합계 : " + item.getTotalPrice());
//
//            allItemsTotal += item.getTotalPrice();
//        }
//
//        System.out.println("전체 가격 합 : " + allItemsTotal);
//    }

//    FIXME : 정답 코드 (REFACTOR 적용)
    public void displayItems(){
        System.out.println("장바구니 상품 출력");

        for (Item item : items) {
            System.out.println("상품명 : " + item.getName() + ", 합계 : " + item.getTotalPrice());
        }

        System.out.println("전체 가격 합 : " + calculatePrice());
    }

    private int calculatePrice() {
        int calculatedTotalPrice = 0;
        for (Item item : items) {
            calculatedTotalPrice += item.getTotalPrice();
        }

        return calculatedTotalPrice;
    }
}
