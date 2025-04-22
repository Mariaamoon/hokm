public class Main {
    public static void main(String[] args) {
        player player1 = new player("mari");
        player1.addCard("10 of Hearts");
        player1.showHand();
        image tenofhearts = new image();
        String playedCard = player1.playCard();
        System.out.println(player1.getName()+"played: " + playedCard);

        player1.showHand();
    }
}
