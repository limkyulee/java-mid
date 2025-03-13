package nested.anonymous.example;

public class Ex0RefMain {
    public static void helloPrint(String message){
        System.out.println("프로그램 시작");
        System.out.println(message);
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {
        helloPrint("Hello Java");
        helloPrint("Hello Spring");
    }
}
