import java.util.Scanner;
import java.util.ArrayList;

public class Guesses
{
    private int guesses = 0;

    public int startGuessing()
    {
        String myGuess;
        String result;
        String[] alreadyGuessed = new String[1000]; // assuming that you won't take over 1000 guesses to finish the game.

        while(!Tester.myBattleships.isEmpty())
        {
            result = "Miss!";

            Scanner kbReader = new Scanner(System.in);
            System.out.print("Enter a guess: ");
            myGuess = kbReader.next();   

            alreadyGuessed[guesses] = myGuess;
            guesses++;

            // make sure that if user has already guessed that cell, that you can inform them.
            for(int i = 0; i < guesses; i++)
            {
                if(i != guesses-1 && myGuess.equals(alreadyGuessed[i]))
                {
                    result = "You've already guessed that cell!";
                    break;
                }
            }

            for(int i = 0; i < Tester.myBattleships.size(); i++)
            {
                Battleship myShip = Tester.myBattleships.get(i);
                ArrayList<String> checkingCells = myShip.locationCells;

                if(checkingCells.size() > 1 && checkingCells.contains(myGuess))
                {
                    result = "Hit!";
                    checkingCells.remove(myGuess);
                    break;
                }
                if(checkingCells.size() <= 1 && checkingCells.contains(myGuess))
                {
                    result = "Kill!";
                    checkingCells.remove(myGuess);
                    Tester.myBattleships.remove(myShip);
                    break;
                }                    
            }

            System.out.println(result);
        }
        return guesses; 
    }
}