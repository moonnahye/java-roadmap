package collection.compare.testByNahye;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {
        this.cards = makeCards();
    }

    public List<Card> getCards() {
        return cards;
    }

    private List<Card> makeCards() {
        List<Card> cards = new ArrayList<>();

       for(int i = 1; i <= 13; i++) {
           cards.add(new Card("♠️", i));
       }
        for(int i = 1; i <= 13; i++) {
            cards.add(new Card("️♣️️", i));
        }
        for(int i = 1; i <= 13; i++) {
            cards.add(new Card("️♦️", i));
        }
        for(int i = 1; i <= 13; i++) {
            cards.add(new Card("♥️", i));
        }
       return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }



    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
