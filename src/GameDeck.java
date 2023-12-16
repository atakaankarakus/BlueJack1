import java.util.Random;
public class GameDeck {
    public String [] deck = new String[40];
    public String[] sets = {"Red","Blue","Green","Yellow"};
    public String[] CardNumbers = {"1","2","3","4","5","6","7","8","9","10"};
    public void CreateTheDeck(){
        for(int i=0;i<10;i++){
            deck[i]=sets[1] + CardNumbers[i];
        }
        for(int i=10;i<20;i++){
            deck[i]=sets[2] + CardNumbers[i-10];
        }
        for(int i=20;i<30;i++){
            deck[i]=sets[3] + CardNumbers[i-20];
        }
        for(int i=30;i<40;i++){
            deck[i]=sets[4] + CardNumbers[i-30];
        }
    }
    public void ShuffleTheDeck(){
        Random random = new Random();
        for(int i=0;i<deck.length;i++){
            int arrayIndexToSwipe = random.nextInt(deck.length);
            int temp = arrayIndexToSwipe;
            arrayIndexToSwipe = deck[i];



        }

    }


}