import Deck.*;
import card.Card;

public class Main {
    public static void main(String[] args) {
        Deck playerDeck = new Deck("Me");
        Deck dealer = new DealerDeck("Dealer");

        playerDeck.getScore();
        playerDeck.displayCards();

        System.out.println("\n-------------");

        dealer.getScore();
        dealer.displayCards();
    }
}