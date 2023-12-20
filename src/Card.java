public class Card {
     public int nowRank;
     public int maxRank = 10;
     public int nowColour;
     public int maxColour = 4;



    public void setNowRank(int h){
         this.nowRank = h;
     }
     public int getNowRank (){
         return nowRank;
     }
     public void setNowColour(int h){
         this.nowColour = h;
     }
     public int getNowColour(){
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



     public String[] ranks = new String [maxRank];
    {
        ranks[0]="one";
        ranks[1]="two";
        ranks[2]="three";
        ranks[3]="four";
        ranks[4]="five";
        ranks[5]="six";
        ranks[6]="seven";
        ranks[7]="eight";
        ranks[8]="nine";
        ranks[9]="ten";
    }
    public String[] colours = new String [maxColour];
    {
        colours[0]="Red";
        colours[1]="Red";
        colours[2]="Red";
        colours[3]="Red";
    }
    public String rank = ranks[nowRank];
    public String colour = colours[nowColour];

    public Card(int x,int y){
        this.nowRank = x;
        this.nowColour = y;
    }


    }

