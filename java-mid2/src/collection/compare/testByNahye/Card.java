package collection.compare.testByNahye;

public class Card {

    private String shape;
    private int number;

    public int getNumber() {
        return number;
    }

    public String getShape() {
        return shape;
    }

    public Card(String shape, int number) {
        this.shape = shape;
        this.number = number;
    }

    @Override
    public String toString() {
        return number+"("+shape+")";
    }

}
