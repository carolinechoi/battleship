import java.util.ArrayList;

public class Randomize
{
    boolean overlap;

    // receives data from the Battleship object
    public ArrayList<String> placeShips(int length, boolean horz, boolean first, ArrayList<String> locations)
    {
        // Note: the board is 9x9 squares, with letters along the X-axis and numbers along the Y-axis
        int len = length;

        // set a boundary so that your ship isn't off the board when you attempt to place it
        int boundary = 10-len;

        // set arbitrary values here so you don't get an initialization error 
        char converted = 'a';
        int firstNumb = 2;
        
        // for the first ship, doesn't matter if overlap exists
        if(first)
        {
            // use random number generator to generate the first square's letter 
            int firstLetter = (int)(Math.random()*boundary);

            while(firstLetter == 0)
                firstLetter = (int)(Math.random()*boundary);

            // convert the integer to a character using ASCII functionalities            
            converted = (char)(firstLetter+64);

            // use random number generator to generate the first square's number
            firstNumb = (int)(Math.random()*boundary);

            while(firstNumb == 0)
                firstNumb = (int)(Math.random()*boundary);   

            // concatenate everything into a string in the form of LetterNumber (e.g. A2)
            // add this string into the object's ArrayList
            locations.add(""+converted+firstNumb);
            
            // if the ship is supposed to be horizontal, add location cells that increment by letter
            if(horz)
            {
                for(int i = 0; i < length-1; i++)
                {
                    converted = (char)(converted + 1);
                    locations.add(""+converted+firstNumb);
                }    
            }     
            else // if the ship is supposed to be vertical, add location cells that increment by number
            {
                for(int i = 0; i < length-1; i++)
                {
                    firstNumb = firstNumb + 1;
                    locations.add(""+converted+firstNumb);
                }    
            }
        }
        if(!first)
        {
            // set overlap = true for the first iteration to run
            overlap = true;
            while(overlap == true)
            {
                int firstLetter = (int)(Math.random()*boundary);
                
                while(firstLetter == 0)
                    firstLetter = (int)(Math.random()*boundary);
                
                converted = (char)(firstLetter+64);
                firstNumb = (int)(Math.random()*boundary);

                while(firstNumb == 0)
                    firstNumb = (int)(Math.random()*boundary);
            
                overlap = checkOverlap(horz, length, firstNumb, converted);
            }
            locations.add(""+converted+firstNumb);

            if(horz)
            {
                for(int i = 0; i < length-1; i++)
                {
                    converted = (char)(converted + 1);
                    locations.add(""+converted+firstNumb);
                }    
            }     
            else
            {
                for(int i = 0; i < length-1; i++)
                {
                    firstNumb = firstNumb + 1;
                    locations.add(""+converted+firstNumb);
                }    
            }
        }
        return locations;
    }

    // send ArrayList here and look through each one
    private boolean checkOverlap(boolean horz, int length, int number, char letter)
    {
        overlap = false; //default value

        for(int i = 0; i < Tester.myBattleships.size(); i++)
        {
            ArrayList<String> checkingCells = Tester.myBattleships.get(i).locationCells;
            
            // make new variables here so that the actual variables are untouched during the loops
            char myLetter = letter; 
            int myNumb = number;

            if(horz)
            {
                for(int j = 0; j < length+1; j++)
                {
                    if(checkingCells.contains(""+myLetter+myNumb))
                    {
                        overlap = true;
                    }
                    myLetter = (char)(myLetter+1);
                }
            }
            else
            {
                for(int k = 0; k < length+1; k++)
                {
                    if(checkingCells.contains(""+myLetter+myNumb))
                        overlap = true;
                    myNumb = myNumb + 1;
                }
            }
        }        
        return overlap;
    }
}