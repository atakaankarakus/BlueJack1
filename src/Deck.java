import java.util.Random;

public class Deck {
    Card[] arr;
    Card[] deck = new Card[40];
    int lastCardIndex = -1;

    public Deck(int size){
        arr = new Card[size];
    }
    public void GameDeck() {
        int p = 0;

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
    public void threeCards(Player player){
        Random rnd = new Random();
        int[] signConverter = new int[3];

        Card[] threeCardArray = new Card[3];

        for(int i =0;i<3;i++){
            int tempC = rnd.nextInt(4);
            int tempR = rnd.nextInt(6);
            int tempS = rnd.nextInt(2);

            if(tempS ==0){
                signConverter[i] =(Integer.valueOf(Card.ranks[tempR]))*-1;
            } else signConverter[i]=(Integer.valueOf(Card.ranks[tempR])) ;

            threeCardArray[i] =new Card(tempR,tempC);
            player.getPlayerDeck().addCard(threeCardArray[i]);
        }
    }
    public void lastTwoCards(Player player){
        Random rnd = new Random();
        int chance = rnd.nextInt(10);
        for(int i=0;i<2;i++){
            if(chance<8) {
            int[] signConverter = new int[2];

            Card[] twoCardArray = new Card[3];

                int tempC = rnd.nextInt(4);
                int tempR = rnd.nextInt(6);
                int tempS = rnd.nextInt(2);

                if (tempS == 0) {
                    signConverter[i] = (Integer.valueOf(Card.ranks[tempR])) * -1;
                } else signConverter[i] = (Integer.valueOf(Card.ranks[tempR]));

                twoCardArray[i] = new Card(tempR, tempC);
                player.getPlayerDeck().addCard(twoCardArray[i]);

        } else {
            int flipOrDouble = rnd.nextInt(2);
            if(flipOrDouble ==0); //flip
            if(flipOrDouble ==1); //double
               // player.getPlayerDeck().addCard(flip or double);
           }
        }
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
