package card;

import java.util.Random;

public class Card  implements ICard{
    private int value;
    private String suit;

    public Card(){
        Random random = new Random();
        int value = random.nextInt((13 - 1) + 1) + 1;


        switch (value) {
            case 1 -> this.suit = "A";
            case 11 -> this.suit = "J";
            case 12 -> this.suit = "Q";
            case 13 -> this.suit = "K";
            default -> this.suit = String.valueOf(value);
        }

        this.value = value > 10 ? 10 : value;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return getValue()+" - "+ getSuit();
    }
}
