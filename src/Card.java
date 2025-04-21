public class Card {
    private  String face;
    private  String suit;
    public Card(String cardface , String cardsuit){
        this.face= cardface;
        this.suit = cardsuit;
    }
    public String toString() {
        return face+" "+suit;
    }
}
