package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

//    해당 메서드의 반환값을 int 로 설정하였을 경우, 값을 찾지 못했을 때도 반환값을 숫자로 설정해야하여 결과 도출의 혼란을 줄 수 있음.
    private static MyInteger findValue(MyInteger[] intArr, int target) {
       for (MyInteger myInteger : intArr){
           if(myInteger.getValue() == target) {
               return myInteger;
           }
       }
//     Null 사용 시, null point exception 이 발생할 수 있기 때문에 주의가 필요함.
       return null;
    }
}
