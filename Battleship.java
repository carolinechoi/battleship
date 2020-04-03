import java.util.Scanner;
import java.util.ArrayList;

public class Battleship
{
    
    boolean horz;
    int length;
    public static boolean first;

    ArrayList<String> locationCells = new ArrayList<String>();
    private Randomize kachow = new Randomize();

    public Battleship()
    {
        // use a random number generator to assign if a ship is horizontal or vertical
        int randNum = (int)(Math.random()*2);
        
        if(randNum == 0)
            horz = true;
        
        else
            horz = false;
        
        // assign the ship a length in between 2 and 4 squares
        length = (int)(Math.random()*5);

        // if the random number generated is 0 or 1, try again
        while(length < 2)
            length = (int)(Math.random()*5);

        // sent object information to the 'Randomize' class and placeships
        locationCells = kachow.placeShips(length, horz, first, locationCells);   

        //UNCOMMENT LINES 36-43 IF YOU'D LIKE TO SEE WHERE THE SHIPS ARE!!!!
        // System.out.print("locationCells:");

        // for(int i = 0; i < locationCells.size(); i++)
        // {
        //     System.out.print(" " + locationCells.get(i));
        // }

        // System.out.print("\n\n");
    }

}