import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();


        Player user = new Player("Kaan");
        Player computer = new Player("Computer");
        Scanner sc = new Scanner(System.in);

        Deck deck = new Deck();
        deck.GameDeck();
        //deck.printDeck();
        deck.shuffleTheDeck();
        //deck.printDeck();
        deck.firstFiveCards(user);
        deck.lastFiveCards(computer);
        deck.threeCards(user);
        deck.threeCards(computer);
        user.getPlayerDeck().printCards();





        System.out.println("Would you like to (1)End (2)Stand or (3)Play a Card ?");
        int response = sc.nextInt();

        if(response ==1){
            deck.askCard(computer);
        } else if (response ==2){

        } else {
            System.out.println("Which Card do you want to play?");
            int playResponse = sc.nextInt();
            user.getBoardCards().addCard(user.getHandCards().removeCard()); //Doğru mu ?
        }




    }
}