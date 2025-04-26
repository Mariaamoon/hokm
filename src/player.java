import java.util.ArrayList;
import java.util.List;

public class player {
    private  String name;
    private List<String> hand;

    public player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }
    public  String getName() {
        return name;
    }


    public void addCard(String card) {
        hand.add(card);
    }

    public String playCard() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        } else {
            return null;
        }
    }

    // Show all cards in hand
    public List<String> getHand() {
        return hand;
    }

    public int handSize() {
        return hand.size();
    }

    // Display player's hand
    public void showHand() {
        System.out.println(name + "'s hand: " + hand);
    }
    public boolean own(String a) {
        if (hand.contains(a))
            return true;
        return false;
    }
}
