package enumeration.test.ex1;

//  Q : 회원의 인증 등급을 AuthGrade 라는 이름의 열거형으로 만들어라.
//      > 인증 등급은 3가지 이고, 인증 등급에 따른 라벨과 설명을 가진다.
//      > 라벨과 설명을 getXxx() 메서드로 조회할 수 있어야 한다.
public enum AuthGrade {
    GUEST(1, "손님"), LOGIN(2, "로그인 회원"), ADMIN(3, "관리자");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
