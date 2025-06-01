package coe318.lab5;

import java.util.ArrayList;

/**
 * @author Rayyan Faisal
 */

public class CardPile {
    private ArrayList<Card> cards;

    public CardPile() {
        cards = new ArrayList<Card>();
    }
    /**
     * add a card to the pile.
     * @param card
     */
    public void addCard(Card card) {
        this.cards.add(card);
    }

    /**
     * Remove aR card chosen at random from the pile.
     * @return
     */
    public Card removeRandom() {
        int num = (int)(Math.random() * this.cards.size());
        return (this.cards.remove(num));
    }

    /**
     * The string representation is a space separated list
     * of each card.
     * @return
     */
    @Override
    public String toString() {
        String list = "\n";
        for (Card card : this.cards) {
            list += card.toString() + "\n";
        }
        return list;
    }

    /**
     * @return the cards
     */
    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public static void main(String[] args) {
        CardPile p = new CardPile();
        p.addCard(new Card(2, 1, true));
        p.addCard(new Card(3, 2, true));
        p.addCard(new Card(4, 3, false));
        p.addCard(new Card(14, 1, true));
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("");
        CardPile deck = new CardPile();
        for(int i = 2; i < 15; i++) {
            for(int j = 0; j < 4; j++) {
                deck.addCard(new Card(i, j, true));
            }
        }
        for (int i = 0; i < 52; i++) {
            System.out.println((i+1) + ": " + deck.removeRandom());

        }
    }
}