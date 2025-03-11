package enumeration.test.ex1;

public class AuthGradeMain1 {
//  Q : 앞서 만든 AuthGrade 를 활용하여 다름과 같이 출력되도록 하라.
//    > grade=GUEST, level=1, 설명=손님
//    > grade=LOGIN, level=2, 설명=로그인 회원
//    > grade=ADMIN, level=3, 설명=관리자
    public static void main(String[] args) {

        AuthGrade[] grades = AuthGrade.values();

        for (AuthGrade grade : grades) {
            System.out.println(
                    "grade : " + grade.name() +
                            ", level : " + grade.getLevel() +
                            ", description : " + grade.getDescription()
            );
        }
    }
}
