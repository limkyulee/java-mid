package collection.map.test.cart;

//  Q : 장바구니
//    - 장바구니 추가 add()
//      > 장바구니에 상품과 수량을 담음. 상품의 이름과 가격이 같으면 같은 상품.
//      > 장바구니에 이름과 가격이 같은 상품을 추가하면 기존에 담긴 상품에 수량만 추가됨.
//      > 장바구니에 이름과 가격이 다른 상품을 추가하면 상품이 추가됨.
//    - 장바구니 제거 minus()
//      > 장바구니에 담긴 상품의 수량을 줄일 수 있음.
//        만약 수량이 0보다 작다면 상품이 장바구니에서 제거됨.
//  CartMain 과 실행 결과를 참고해서 Product, Cart 클래스를 완성하라.
//  Cart 클래스는 Map 을 통해 상품을 장바구니에 보관함.
//  Map 의 key 는 Product 가 사용되고, value 는 장바구니에 담은 수량이 사용됨.
public class CartMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("사과", 1000), 1);
        cart.add(new Product("바나나", 500), 1);
        cart.printAll();

        cart.add(new Product("사과", 1000), 2);
        cart.printAll();

        cart.minus(new Product("사과", 1000),3);
        cart.printAll();
    }
}
