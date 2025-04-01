package collection.compare.test;

 /*
  Q : 카드 게임 만들기
    : 카드는 1-13 까지 있음. 각 번호당 다음 4개의 문양이 있음. (총 52장)
    ♠ | 스페이드 | \u2660
    ♥ | 하트 | \u2665
    ♦ | 다이아 | \u2666
    ♣ | 클로버 | \u2663
    52장의 카드 뭉치를 덱(Deck) 이라 함.
    2명의 플레이어(Player) 가 게임을 진행함.

    게임은 다음 순서를 따름.
    1. 덱에 있는 카드를 랜덤하게 섞는다.
    2. 각 플레이어는 덱에서 카드를 5장씩 뽑는다.
    3. 각 플레이어는 5장의 카드를 정렬된 순서대로 보여준다. 정렬 기준은 다음과 같다.
        > 작은 순서가 먼저 나옴.
        > 같은 숫자의 경우 ♠, ♥, ♦, ♣ 순으로 정렬.
    4.카드 숫자의 함계가 큰 플레이어가 승리한다.
*/

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");

        for (int i = 0; i < 5; i++){
            player1.dealCard(deck);
            player2.dealCard(deck);
        }

        player1.showCard();
        player2.showCard();

        Player winner = getWinner(player1, player2);
        if(winner != null){
            System.out.println(winner.getName() + " won the game!");
        }

    }

    private static Player getWinner(Player player1, Player player2) {
        int sum1 = player1.getSum();
        int sum2 = player2.getSum();

        return sum1 > sum2 ? player1 : ( sum1 == sum2 ? null : player2);
    }
}
