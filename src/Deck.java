import java.util.Random;

public class Deck {
    Card[] arr;
    Card[] deck = new Card[40];
    int lastCardIndex = -1;
    Card Card=new Card();

    public Deck(int size){
        arr = new Card[size];
    }
    public void GameDeck() {
        int p = 0;

        while (p < 40) {
            for (int i = 0; i < 10; i++) {
                for (int g = 0; g < 4; g++) {
                    deck[p] = new Card(i, g,"+");
                    p++;
                }
            }
        }



    }
    public Deck (){

    }
    public void printDeck(){
        for (int i = 0; i < 40; i++){
            System.out.print(deck[i].getNowRank()+ deck[i].getNowColour().charAt(0)+" ");
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
    public void firstFiveCards(Player player){
        for(int i =0;i<5;i++){
            player.getPlayerDeck().addCard(deck[i]);
            deck[i]= null;
        }
    }
    public void lastFiveCards(Player player){
        for(int i =39;i>34;i--){
            player.getPlayerDeck().addCard(deck[i]);
            deck[i]= null;
        }
    }
    public void threeCards(Player player) {
        Random rnd = new Random();
        Card[] threeCardsArr = new Card[3];
        for (int i = 0; i < 3; i++) {
            int rank = rnd.nextInt(10) + 1;
            String sign = rnd.nextBoolean() ? "+" : "-";
            String color = Card.colours[rnd.nextInt(4)];
            threeCardsArr[i] = new Card(rank, color,sign);
            player.getPlayerDeck().addCard(threeCardsArr[i]);
        }
    }

    public void lastTwoCards(Player player) {
        Random rnd = new Random();
    }
    public void pickFourCards(Player player) {
        Deck tempArray = player.getPlayerDeck();
        for (int i = 0; i < 4; i++) {
            //player.getHandCards().addCard(tempArray[i]);
            //player.getPlayerDeck().removeCard();
        }
    }
    public void askCard(Player player) {
        player.getBoardCards().addCard(deck[lastCardIndex]);
        //removeCard()
    }

    public void printCards(){
        for (int i = 0; i <= lastCardIndex; i++) {
            System.out.print(arr[i].getNowRank() + arr[i].getNowColour().charAt(0) + " ");
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
