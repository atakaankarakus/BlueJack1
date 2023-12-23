public class Card {
     private String nowRank;
     private static int maxRank = 10;
     private String nowColour;
     private static int maxColour = 4;


    public void setNowRank(String h){
         this.nowRank = h;
     }
     public String getNowRank (){
         return nowRank;
     }
     public void setNowColour(String h){
         this.nowColour = h;
     }
     public String getNowColour(){
         return nowColour;
     }
    public void setMaxRank(int h) {
        this.maxRank = h;
    }
    public int getMaxRank () {
        return maxRank;
    }
    public void setMaxColour(int h) {
        this.maxColour = h;
    }
    public int getMaxColour(){
        return maxColour;
    }



     public static String[] ranks = new String [maxRank];
    {
        ranks[0]="1";
        ranks[1]="2";
        ranks[2]="3";
        ranks[3]="4";
        ranks[4]="5";
        ranks[5]="6";
        ranks[6]="7";
        ranks[7]="8";
        ranks[8]="9";
        ranks[9]="10";
    }
    public static String[] colours = new String [maxColour];
    {
        colours[0]="Red";
        colours[1]="Blue";
        colours[2]="Yellow";
        colours[3]="Green";
    }

    public Card(){

    }

    public Card(int a ,int b){
        this.nowRank = ranks[a];
        this.nowColour = colours[b];
    }
    public Card(String rank ,String colour){
        this.nowRank = rank;
        this.nowColour = colour;
    }
}

