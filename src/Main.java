public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
    player[] players = new player[3];
        for (int i = 0; i < players.length; i++) {
            players[i] = new player("mari " + (i + 1));
        }
deck.shuffle();
deck.deal();

players[0].addCard(deck.s);
players[0].showHand();
        deck.deal();
        players[1].addCard(deck.s);
        players[1].showHand();


    }
}
