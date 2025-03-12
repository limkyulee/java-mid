package nested;

//  쉐도잉(Shadowing) | 같은 이름의 바깥 변수가 존재할 경우
//      > 프로그래밍에서는 대부분 가깝거나, 구체적인 것을 우선으로 한다.
public class ShadowingMain {
    public int value = 1;

    class Inner {
        public int value = 2;

        void go(){
            int value = 3;
            System.out.println("value : " + value);
            System.out.println("this.value : " + this.value);
            System.out.println("ShadowingMain.this.value : " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain shadowingMain = new ShadowingMain();
        Inner inner = shadowingMain.new Inner();
        inner.go();
    }
}
