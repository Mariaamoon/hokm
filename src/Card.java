public class Card {
    private String face;
    private String suit;
    public Card(String cardface, String cardsuit) {
        this.face = cardface;
        this.suit = cardsuit;
    }
    public static int setvalue(String s) {
        int value = 0;
        if (s.contains("Deuce"))
            value = 2;
        else if (s.contains("Three"))
            value = 3;
        else if (s.contains("Four"))
            value = 4;
        else if (s.contains("Five"))
            value = 5;
        else if (s.contains("Six"))
            value = 6;
        else if (s.contains("Seven"))
            value = 7;
        else if (s.contains("Eight"))
            value = 8;
        else if (s.contains("Nine"))
            value = 9;
        else if (s.contains("Ten"))
            value = 10;
        else if (s.contains("Jack"))
            value = 11;
        else if (s.contains("Queen"))
            value = 12;
        else if (s.contains("King"))
            value = 13;
        else if (s.contains("Ace"))
            value = 14;
        if (s.contains(rules.Hokm))
            value += 20;
        return value;
    }

    public String toString() {
        return face + " " + suit;
    }
    public String getImageFileName() {
        return faceToNumber(face) + "_of_" + suit.toLowerCase() + ".png";
    }

    private String faceToNumber(String face) {
        return switch (face) {
            case "Deuce" -> "2";
            case "Three" -> "3";
            case "Four" -> "4";
            case "Five" -> "5";
            case "Six" -> "6";
            case "Seven" -> "7";
            case "Eight" -> "8";
            case "Nine" -> "9";
            case "Ten" -> "10";
            case "Jack" -> "jack";
            case "Queen" -> "queen";
            case "King" -> "king";
            case "Ace" -> "ace";
            default -> "unknown";
        };
    }

}
