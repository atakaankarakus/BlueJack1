import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name!");
        String name = sc.nextLine().trim();


        Player user = new Player(name);
        Player computer = new Player("Computer");

        Deck deck = new Deck();
        deck.GameDeck();
        deck.shuffleTheDeck();

        deck.firstFiveCards(user);
        deck.lastFiveCards(computer);
        deck.threeCards(user);
        deck.threeCards(computer);
        deck.lastTwoCards(user);
        deck.lastTwoCards(computer);
        System.out.println();

        for (int i = 0; i < 4; i++){
            user.getHandCards().addCard(user.getPlayerDeck().removeCard());
            computer.getHandCards().addCard(computer.getPlayerDeck().removeCard());
        }

        System.out.println("Would you like to (1)End (2)Stand or (3)Play a Card ?");

}}