import java.util.Random;
public class GameDeck{
    public static int nowRank = 10;
    public static int nowColour=4;
    public static int CardNumbers = nowColour*nowRank;
    int p = 0;
    Card[] deck = new Card[CardNumbers];

public GameDeck(){

    while(p<52){
        for(int i = 1; i<=nowRank;i++){
            for(int g = 1; g<=nowColour;g++){
                deck[p] = new Card(i,g);
                p++;
            }
        }
    }
}
public class ShuffleTheDeck{
    Random rnd = new Random();
    public void Shuffle(){
        for (int i =deck.length;i>=0;i--){
            int randomIndex = rnd.nextInt(deck.length);
            Card temporary =deck[i];
            deck[i]=deck[randomIndex];
            deck[randomIndex]= temporary;
        }


    }

}
}
