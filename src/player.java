import java.util.ArrayList;
import java.util.List;

public class player {
    private String name;
    private List<String> hand;

    public player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        String nm = name;
        return nm;
    }

    public void addCard(String card) {
        hand.add(card);
    }

    public String playCard(int m) {
        if (!hand.isEmpty()) {
            return hand.remove(m);
        } else {
            return null;
        }
    }

    public String getHand(int n) {
        return hand.get(n);
    }

    public int handSize() {
        return hand.size();
    }

    public void showHand() {
        System.out.println(name + "'s hand: " + hand);
    }

    public boolean own(String a) {
        if (hand.contains(a))
            return true;
        return false;
    }

    public boolean chooseCard(int a) {
        if(hand.get(a).contains(rules.hokm))
            return true;
        int count =0;
        for (String s : hand) {
               if(s.contains(rules.hokm)==false)
            count++;
        }
        if(count == handSize())
            return true;
        return false;
    }
}
