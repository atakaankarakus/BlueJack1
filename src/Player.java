import java.util.Scanner;
public class Player {
    private String name;
    private int score;
    private Deck handCards;
    private Deck boardCards;
    private Deck playerHand;
    private Deck computerHand;
    private Deck computerBoard;
    private Deck playerBoard;
    public String getName(){return  name;}
    public Deck getHandCards(){return handCards;}
    public Deck getBoardCards(){return boardCards;}
    public int getScore(){return score;}
    public Deck getPlayerHand(){return playerHand;}
    public Deck getComputerHand(){return computerHand;}
    public Deck getPlayerBoard(){return playerBoard;}
    public Deck getComputerBoard(){return computerBoard;}

    public Player(){

    }

    public Player(String newName){
        name = newName;
        handCards = new Deck(4);
        boardCards = new Deck(10);
    }

    public void play(){
        Scanner sc = new Scanner(System.in);
        if(name == "Computer"){

        }else{
            System.out.println("Please enter your number.");
            int enteredNumber = sc.nextInt();
            //Card temp = handCards.removeCard(enteredNumber);
            //boardCards.addCard(temp);
        }
    }
}
