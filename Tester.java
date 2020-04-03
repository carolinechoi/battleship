import java.util.ArrayList;

public class Tester
{
    public static ArrayList<Battleship> myBattleships = new ArrayList<Battleship>();

    // initialize the Randomizing class
    private Randomize kachow = new Randomize();

    public static void main(String[] args)
    {
        Tester game = new Tester();
        game.newBoard();

        // start guessing here
        Guesses start = new Guesses();
        int guesses = start.startGuessing();
        // return and print the number of guesses
        System.out.println("\n>> You have defeated the Spanish!!");
        System.out.println(">>> The only way back to Spain was the perilous journey around the coast of Scotland, and many a Spaniard never saw his home country again.");
        System.out.println(">>>> You, Queen Elizabeth, eat a celebratory meal of scones and Earl Grey tea.");
        System.out.println(">>>>> Your victory cost you: " + guesses + " tries."); 
    }

    private void newBoard()
    {
        // creating four new Battleship objects
        Battleship.first = true;
        Battleship one = new Battleship();
        myBattleships.add(one);

        // need to change the 'first' variable to 'false' now that overlap can incur
        Battleship.first = false;
        Battleship two = new Battleship();
        myBattleships.add(two);

        Battleship three = new Battleship();
        myBattleships.add(three);

        Battleship four = new Battleship();
        myBattleships.add(four); 

        System.out.println(">> The year is 1588. Spain has been building its mighty fleet (of four ships!!) for months.\n");
        System.out.println(">> You are the astonishingly beautiful Queen Elizabeth.");
        System.out.println(">>> Sipping tea and surrounded by your many lovers, you hatch plans to take down the Spanish ships.");
        System.out.println(">>>> If you fail, you'll be captured and probably excecuted. No big deal.\n");
        System.out.println(">> Let the Spanish Armada begin!\n");
        
        System.out.println("(Good luck. The game is harder than I thought...)\nNOTE: the ships are of different lengths.\n\n");
    }

}