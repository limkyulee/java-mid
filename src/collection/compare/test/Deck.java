package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    public void initCard(){
        for(int i = 1; i <= 13; i++){
            for(Suit suit : Suit.values()){
                cards.add(new Card(i, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        return cards.removeFirst();
    }
}
