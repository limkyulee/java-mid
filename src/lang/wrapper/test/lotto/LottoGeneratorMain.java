package lang.wrapper.test.lotto;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] result = lottoGenerator.generate();

        System.out.println("로또 번호");
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
