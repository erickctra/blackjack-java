package Deck;

import card.Card;

import java.util.ArrayList;

public class Deck implements IDeck {
    private ArrayList<Card> cards;
    private int score;
    private String player;

    public Deck(String player) {
        cards = new ArrayList<>();

        this.score = 0;
        this.player = player;

        AddCard(new Card());
        AddCard(new Card());
    }

    public void AddCard(Card card) {
        this.cards.add(card);
        this.score += card.getValue();
    }

    public void getScore() {
        System.out.println("\nScore: "+this.score);;
    }

    public void getCards() {
        for(Card card: this.cards) {
            System.out.print("|"+ card.getValue()+ " - "+card.getSuit()+ "|");;
        }
    }
}
