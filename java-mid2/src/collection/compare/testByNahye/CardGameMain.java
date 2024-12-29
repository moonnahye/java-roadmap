package collection.compare.testByNahye;

public class CardGameMain {
    public static void main(String[] args) {

        Deck deck1 = new Deck();
        deck1.shuffle();
        Deck deck2 = new Deck();
        deck2.shuffle();

        Player player1 = new Player("player1", deck1);
        Player player2 = new Player("player2", deck2);

        playGame(player1, player2);


    }

    static void playGame(Player player1, Player player2) {
        int player1Result = player1.play();
        int player2Result = player2.play();

        System.out.println(
                (player1Result > player2Result) ? player1.getName() + "의 승리"
                        : (player1Result == player2Result) ? "무승부 입니다."
                        : player2.getName() + "의 승리"
        );
    }
}
