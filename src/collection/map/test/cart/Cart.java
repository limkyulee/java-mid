package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> productMap = new HashMap<>();


//  FIXME : 정답 코드.
//     > getOrDefault 를 사용하여 키가 없는 경우 대신 사용할 수 있는 값을 지정.
    public void add(Product product, int count) {
        int existingCount = productMap.getOrDefault(product, 0);
        productMap.put(product, existingCount + count);
    }

    public void minus(Product product, int count) {
        int existingCount = productMap.getOrDefault(product, 0);
        int newCount = existingCount - count;

        if(newCount <= 0) {
            productMap.remove(product);
        }else{
            productMap.put(product, newCount);
        }
    }

//    FIXME : 내가 작성한 코드.
//    public void add(Product product, int count) {
//        if (!productMap.containsKey(product)) {
//            productMap.put(product, count);
//        }else{
//            productMap.put(product, productMap.get(product) + count);
//        }
//
//    }
//
//    public void minus(Product product, int count) {
//        if(productMap.containsKey(product)) {
//            if(productMap.get(product) > count) {
//                productMap.put(product, productMap.get(product) - count);
//            }else {
//                productMap.remove(product);
//            }
//
//        }
//    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : productMap.entrySet()) {
            System.out.println("상품 : " + entry.getKey() + " 수량 : " + entry.getValue());
        }
    }


}
