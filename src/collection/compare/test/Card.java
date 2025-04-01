package collection.compare.test;

public class Card implements Comparable<Card> {
    private final int cardNumber;
    private final Suit cardSuit;

    public Card(int cardNumber, Suit cardSuit) {
        this.cardNumber = cardNumber;
        this.cardSuit = cardSuit;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public Suit getCardSuit() {
        return cardSuit;
    }

    @Override
    public int compareTo(Card o) {
        if(this.cardNumber != o.cardNumber){
            return Integer.compare(this.cardNumber, o.cardNumber);
        }else {
            return this.cardSuit.compareTo(o.cardSuit);
        }
    }

    @Override
    public String toString() {
        return cardNumber +
                "(" + cardSuit.getIcon() + ")";
    }
}
