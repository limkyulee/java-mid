package lang.wrapper;

public class MyIntegerNullMain {
    public static void main(String[] args) {
        int[] intArr = new int[]{-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(findValue(intArr, -1)); // -1
        System.out.println(findValue(intArr, 0)); // 0
        System.out.println(findValue(intArr, 1)); // 1
        System.out.println(findValue(intArr, 100)); // -1
    }

//    해당 메서드의 반환값을 int 로 설정하였을 경우, 값을 찾지 못했을 때도 반환값을 숫자로 설정해야하여 결과 도출의 혼란을 줄 수 있다.
    private static int findValue(int[] intArr, int target) {
       for (int value : intArr){
           if(value == target) {
               return value;
           }
       }

       return -1;
    }
}
