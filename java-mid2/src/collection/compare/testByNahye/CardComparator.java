package collection.compare.testByNahye;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        int number1 = o1.getNumber();
        int number2 = o2.getNumber();

        return number1 - number2;
    }
}
