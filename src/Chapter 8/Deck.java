// Chapter 8 (Object-Oriented Design) Problem 1 Solution
// (C) 2014 kmaune0
// Deck.java
// Design the data structures for a generic deck of cards.

public enum Suit {
  Club (0), Diamond (1), Heart (2), Spade (3);
  private int value;
  private Suit(int v) {value = v;}
  public int getValue() {return value;}
  public static Suit getSuitFromValue(int value) {...}
}

public class Deck <T extends Card> {
  private ArrayList<T> cards; // all cards, dealt or not
  private int dealtIndex = 0; // marks the first undealt card

  public void setDeckOfCards(ArrayList<T> deckOfCards) {...}

  public void shuffle() {...}
  public int remainingCards() {
    return cards.size() - dealtIndex;
  }

  public T[] dealHand(int number) {...}
  public T dealCard() {...}
}

public abstract class Card {
  private boolean available = true;

  // number or face that's on card - a number 2 through 10, or 11 for Jack, 12 for Queen, 13 for King, or 1 for Ace
  protected int faceValue;
  protected Suit suit;

  public Card(int c, Suit s) {
    faceValue = c;
    suit = s;
  }

  public abstract int value();

  public Suit suit() {return suit;}

  // checks if the card is available to be given out to someone
  public boolean isAvailable() {return available;}
  public void markUnavailable() {available = false;}

  public void markAvailable() {available = true;}
}

public class Hand <T extends Card> {
  protected ArrayList<T> cards = new ArrayList<T>();

  public int score() {
    int score = 0;
    for (T card : cards) {
      score += card.value();
    }

    return score;
  }

  public void addCard(T card) {
    cards.add(card);
  }
}
