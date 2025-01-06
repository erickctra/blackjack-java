import Deck.*;
import card.Card;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck playerDeck = new Deck("Me");
        Deck dealer = new DealerDeck("Dealer");

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println(" ----- Blackjack -----");

            playerDeck.getScore();
            playerDeck.displayCards();

            System.out.println("\n-------------");

            dealer.getScore();
            dealer.displayCards();

            System.out.println("\n\nPress <P> and hit Enter to push a new card");

            int option = scanner.nextInt();

            if (option == 1 ) {
                isRunning = false;
            }
        }
    }
}