import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();
        deck.GameDeck();
        deck.printDeck();
        deck.shuffleTheDeck();
        System.out.println();
        deck.printDeck();
        deck.FirstFiveCards();
        deck.LastFiveCards();

        Player user = new Player("Kaan");
        Player computer = new Player("Computer");


        System.out.println(user.getName());


    }
}