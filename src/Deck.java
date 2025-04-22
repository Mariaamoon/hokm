
import java.security.SecureRandom;

public class Deck {
    private Card[] deck;
    private int currentCard;
    private static final int numberOfCards = 52 ;
    private static final SecureRandom random = new SecureRandom();
    public Deck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] faces = {"Ace", "Deuce", "Three", "Four" ,"Five", "Six", "Seven", "Eight", "Nine","Ten","Jack","Queen","King"};

        deck = new Card[numberOfCards];

        currentCard = 0;
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i%13], suits[i/13]);
        }}
        public void shuffle()
    {
            currentCard = 0;
            for (int i = 0; i < deck.length; i++) {
                int second = random.nextInt(numberOfCards);
                Card temp = deck[i];
                deck[i] = deck[second];
                deck[second] = temp;
            }
        }
        public Card deal(){
            if(currentCard < deck.length)
                return deck[currentCard++];
                else
                    return null;

        }


    }

