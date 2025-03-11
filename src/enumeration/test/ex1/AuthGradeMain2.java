package enumeration.test.ex1;


import java.util.Scanner;

public class AuthGradeMain2 {
//  Q : 인증 등급을 입력 받아 AuthGrade 열거형으로 변환하라.
//    > 인증 등급에 따라 접근할 수 있는 화면이 다르다.
//    > 각각의 등급에 따라서 출력되는 메뉴 목록이 달라진다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요. [GUEST, LOGIN, ADMIN] : ");
        String grade = scanner.nextLine();

//      입력 받은 인증 등급 AuthGrade 열거형으로 변환
//      grade.toUpperCase() : 사용자가 소문자로 이력했을 경우 대비 방어 로직 설정.
        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());

        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
        System.out.println("==메뉴 목록==");

//        FIXME : 내가 생각한 로직
//        String[] menuList = new String[]{"메인 화면", "이메일 관리 화면", "관리자 화면"};

//        for (int i = 0; i < authGrade.getLevel(); i++) {
//            System.out.println("- " + menuList[i]);
//        }

//        FIXME : 정답 로직
        System.out.println("==메뉴 목록==");
        if (authGrade.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }
        if (authGrade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }
        if (authGrade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }
    }
}
