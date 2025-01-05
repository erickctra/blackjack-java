package Deck;

import card.Card;

import java.util.ArrayList;

public interface IDeck {
    void AddCard(Card card);
    void displayCards();
    void getScore();
}
