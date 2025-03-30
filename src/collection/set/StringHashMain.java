package collection.set;

//  FIXME : 문자열 해시 코드
//   PLUS : 각 문자에는 고유한 숫자가 할당되어있음. (ASCII)
//     > 1. 문자를 숫자로 변경.
//     > 2. 변경된 숫자로 해시 인덱스 생성
//     > 3. 생성된 해시 인덱스를 배열의 인덱스로 사용.
//   LIMIT : 어떤 객체든 정수로 만든 해시 코드를 정의할 수 있다면 해시 인덱스 사용 가능.
//           하지만, 문자가 아닌 사용자가 정의한 객체에 대해서는 어떻게 해시 코드를 정의할 수 있는가?

/**
 * 해시 코드 : 데이터를 대표하는 값
 * 해시 함수 : 해시 코드를 생성하는 함수
 * 해시 인덱스 : 해시 코드를 사용하여 데이터의 위치를 결정하는 값
 */

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
//      char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA : " + (int)charA);
        System.out.println("charB : " + (int)charB);

//      hashCode
        System.out.println();
        System.out.println("hashCode('A') : " + hashCode("A")); // 65
        System.out.println("hashCode('B') : " + hashCode("B")); // 66
        System.out.println("hashCode('C') : " + hashCode("AB")); // 65 + 66

//      hashIndex
        System.out.println("hashIndex(hashIndex('A')) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(hashIndex('B')) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(hashIndex('AB')) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str){
//      toCharArray() : 문자열을 Char 배열로 변경.
        char[] chars = str.toCharArray();
        int sum = 0;
        for(char c : chars){
            sum += c;
        }

        return sum;
    }

    static int hashIndex(int hashCode){
        return hashCode % CAPACITY;
    }
}
