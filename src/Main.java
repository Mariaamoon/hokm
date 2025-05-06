import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();
        player[] players = new player[4];
        for (int i = 0; i < 4; i++) {
            //String playerName = sc.nextLine();
            players[i] = new player("playerName" + i);
        }
        deck.shuffle();
        for (int i = 0; i < 5; i++) {
            deck.deal();
            players[0].addCard(deck.s);
        }
        players[0].showHand();
        System.out.println("choose your Hokm");
        String choice = sc.next();
        rules.Hokm = choice;
        for (int i = 0; i < 8; i++) {
            deck.deal();
            players[0].addCard(deck.s);
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 13; j++) {
                deck.deal();
                players[i].addCard(deck.s);
            }
        }
        for (int k = 0; k < 13; k++) {
            int ar[] = new int[4];
            int max = 0;
            int maxp = 0;
            for (int i = 0; i < 4; i++) {
                if (i == 0) {
                    players[0].showHand();
                    System.out.println("choose your card");
                    int p = sc.nextInt();
                    String hm = players[0].getHand(p).toString();
                    rules.sethokm(hm);
                    ar[0] = Card.setvalue(hm);
                    players[0].playCard(p);
                    max = ar[0];
                    maxp = i;
                }
                if (i > 0) {
                    players[i].showHand();
                    System.out.println("choose your card");
                    int j = sc.nextInt();
                    while (players[i].chooseCard(j) == false) {
                        System.out.println("Choose a valid card");
                        j = sc.nextInt();
                    }
                    if (players[i].chooseCard(j) == true) {
                        String card = players[i].getHand(j).toString();
                        ar[i] = Card.setvalue(card);
                        players[i].playCard(j);
                        if (ar[i] > max) {
                            max = ar[i];
                            maxp = i;
                        }
                    }
                }
            }
            rules.setwins(maxp);
            System.out.println(rules.wins1);

            if (rules.wins1 == 7 || rules.wins2 == 7) {
                System.out.println("The winner is team" + (rules.wins1 == 7 ? "1" : " 2 "));
                return;
            }
        }
    }
}
