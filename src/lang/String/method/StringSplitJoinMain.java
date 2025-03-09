package lang.String.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Red,Yellow,Green,Blue,Orange,Violet";

//        split()
        String[] strs = str.split(",");
        for (String s : strs) {
            System.out.println(s);
        };

//        join()
        String JoinedStr = String.join(",", "A", "B", "C", "D");
        System.out.println("Joined String: " + JoinedStr);

        String arrayStrJoined = String.join("-", strs);
        System.out.println("Joined String Arr : " + arrayStrJoined);
    }
}
