package lang.String.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
//        StringBuilder 는 메서드 체이닝 기법을 제공한다.
//        StringBuilder 의 메서드는 자기 자신의 참조값을 반환하기 떄문아다.
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A")
                .append("B")
                .append("C")
                .append("D")
                .insert(4, "Java")
                .delete(4, sb.length())
                .reverse()
                .toString();

        System.out.println("string = " + string);

//        메서드 체이닝 방식으로 만들어진 메서드들은 사용하기 편리하기 때문에,
//        종종 자바의 라이브러리와 오픈소스들은 메서드 체이닝 방식을 종종 사용한다고 한다.
    }
}
