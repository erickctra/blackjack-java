package Deck;

import card.Card;

import java.util.ArrayList;

public class  Deck implements IDeck {
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
//        if (player == "Dealer") {
//            System.out.println("Dealer");
//            System.out.println("Score: " + (this.score - this.cards.get(1).getValue())+"?");
//            return;
//        }

        System.out.println(this.player);
        System.out.println("Score: "+this.score);;
    }


    public void displayCards() {
//        if (player == "Dealer") {
//            System.out.print("Deck: ");
//            System.out.print("/"+this.cards.get(0).getSuit()+"/ ...");
//            return;
//        }

        System.out.print("Deck: ");
        for(Card card: this.cards) {
            System.out.print("/"+ card.getSuit()+ "/ ");
        }
    }
}
