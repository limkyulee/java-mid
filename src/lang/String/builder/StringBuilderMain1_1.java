package lang.String.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
//        StringBuilder 는 불변이 아니기 떄문에 반환값을 받지않아도 된다.
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert 4 = " + sb);

        sb.delete(4, sb.length());
        System.out.println("delete 4 = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

//        StringBuilder(가변) -> String(불변)
//        StringBuilder 는 보통 문자열을 변경하는 동안만 사용하다가 문자열 변경이 끝나면 String 으로 변환하는 것이 안전하다.
        String string = sb.toString();
        System.out.println("string = " + string);

        string.toLowerCase();
        System.out.println("string immutable test = " + string);
    }
}
