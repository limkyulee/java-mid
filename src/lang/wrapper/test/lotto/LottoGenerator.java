package lang.wrapper.test.lotto;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int counter;

    public int[] generate() {
        lottoNumbers = new int[6];
        counter = 0;

        while(counter < 6) {
            int lotto = random.nextInt(44) + 1;

            if(isValidPassed(lottoNumbers, lotto)){
                lottoNumbers[counter] = lotto;
                counter++;
            }
        }

        return lottoNumbers;
    };

    private boolean isValidPassed(int[] validArr, int target){
      for(int i = 0; i < counter; i++){
          if(validArr[i] == target){
              return false;
          }
      }

      return true;
    };
}
