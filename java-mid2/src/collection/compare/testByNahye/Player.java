package collection.compare.testByNahye;

import java.util.List;

public class Player {

    private String name;
    private Deck deck;

    public Player(String name, Deck deck) {
        this.name = name;
        this.deck = deck;
    }

    public String getName() {
        return name;
    }

    public int play() {
        List<Card> cards = deck.getCards().subList(0, 5);
        cards.sort(new CardComparator());
        int sum = 0;
        for (Card card : cards) {
            sum += card.getNumber();
        }
        System.out.println(this.name + "의 카드 : " + cards+", 합계 : " + sum);
        return sum;
    }


}
