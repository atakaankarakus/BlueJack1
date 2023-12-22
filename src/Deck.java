import java.util.Random;

public class Deck {
    Player addOrRem = new Player();
    Card[] arr;
    int p =0;
    Card[] deck = new Card[40];
    int lastCardIndex = -1;

    public Deck(int size){
        arr = new Card[size];
    }
    public void GameDeck() {

        while (p < 40) {
            for (int i = 0; i < 10; i++) {
                for (int g = 0; g < 4; g++) {
                    deck[p] = new Card(i, g);
                    p++;
                }
            }
        }



    }
    public Deck (){

    }
    public void printDeck(){
        for (int i = 0; i < 40; i++){
            System.out.print(deck[i].getNowRank()+deck[i].getNowColour().charAt(0)+" ");
        }
    }
    public void shuffleTheDeck()
    {
        Random rnd = new Random();
        for (int i = deck.length - 1; i >= 0; i--) {
            int randomIndex = rnd.nextInt(deck.length);
            Card temporary = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temporary;
        }
    }
    public void FirstFiveCards(){
        for(int i =0;i<5;i++){
            addOrRem.getPlayerBoard().addCard(deck[i]);
            deck[i]= null;
        }
    }
    public void LastFiveCards(){
        for(int i =39;i>34;i--){
            addOrRem.getComputerBoard().addCard(deck[i]);
            deck[i]= null;
        }
    }



    public void addCard(Card addedCard){
        lastCardIndex++;
        arr[lastCardIndex] = addedCard;
    }
    public Card removeCard(){
        if(lastCardIndex < 0) return null;

        Card temp = arr[lastCardIndex];
        arr[lastCardIndex] = null;
        lastCardIndex--;
        return temp;
    }
}
