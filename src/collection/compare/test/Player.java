package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final List<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public void dealCard(Deck deck) {
        cards.add(deck.deal());
    }

    public int getSum(){
        int sum = 0;
        for (Card card : cards) {
            sum += card.getCardNumber();
        }

        return sum;
    }

    public void showCard(){
        cards.sort(null);
        System.out.println(name + "의 카드 : " + cards + ", 합계 : " + getSum());

    }

    public String getName() {
        return name;
    }
}
