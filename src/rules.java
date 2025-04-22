public class rules {
    private String khal;
    public void setKhal(String kh){
        khal = kh;
    }
    public int setvalue(String s){
        int value=0;
        if(s.contains("Deuce"))
            value = 2;
        else if(s.contains("Three"))
            value = 3;
        else if(s.contains("Four"))
            value = 4;
        else if(s.contains("Five"))
            value = 5;
        else if(s.contains("Six"))
            value = 6;
        else if(s.contains("Seven"))
            value = 7;
        else if(s.contains("Eight"))
            value = 8;
        else if(s.contains("Nine"))
            value = 9;
        else if(s.contains("Ten"))
            value = 10;
        else if(s.contains("Jack"))
            value = 11;
        else if(s.contains("Queen"))
            value = 12;
        else if(s.contains("King"))
            value = 13;
        else if(s.contains("Ace"))
            value = 14;
        if(s.contains("Khal"))
            value += 20;
        return value;
        }

    }

