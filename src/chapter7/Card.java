package chapter7;

//Fig. 7.9
public class Card {
    private final String face; //face of card ("Ace", "Deuce", ...)
    private final String suit; //suit of card("Hearts", "Diamonds", ...)

    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    public String toString() {
        return face + " of " + suit;
    }
}
