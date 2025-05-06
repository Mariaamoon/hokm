public class rules {
    public static String Hokm;
    public static String hokm;
    public static int team1;
    public static int team2;
    public static int wins1;
    public static int wins2;

    public static void setwins(int a) {
        if (a % 2 == 0)
            wins2++;
        else
            wins1++;
    }
    public static boolean end() {
        if(wins2 ==7 || wins1==7)
            return true;
        return false;
    }
    public  void setHokm(String h) {
            this.Hokm = h;
    }

    public static void sethokm(String h) {
      if(h.contains("Hearts"))
        hokm = "Hearts";
        if(h.contains("Clubs"))
            hokm = "Clubs";
       else if(h.contains("Diamonds"))
            hokm = "Diamonds";
        else if (h.contains("Spades"))
            hokm = "Spades";

    }

    public int winner() {
        if (wins1 == 7)
            return 1;
        return 2;
    }

}
