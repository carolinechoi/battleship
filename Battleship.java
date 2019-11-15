public class Battleship
{
    boolean horz;
    int length;
    boolean overlap;

    public Battleship()
    {
        int randNum = (int)(Math.random()*2);
        if(randNum == 0)
            horz = true;
        else
            horz = false;
        // look into minimum boundary for random method!
        length = (int)(Math.random()*6);
        while(length < 2)
        {
            length = (int)(Math.random()*6);
        }
        // overlapping()
        overlap = true; //set overlap to true in order to run it at least once always
        place();
    }

    private String[] place()
    {
        // store locations as Chars. ex: A7.
        String[] location = new String[length];
        int boundary = 10-length;
        // System.out.println("Boundary: " + boundary);
        // numbers 1-9
        // ASCII from 
        // if 1 ==> +64 ==> A (65)
        // if 2 ==> +64 ==> B (66)...
        char converted = 'a';
        int firstNumb = 2;

        if(overLapping())
        {
            int firstLetter = (int)(Math.random()*boundary);

            while(firstLetter == 0)
                firstLetter = (int)(Math.random()*boundary);
    
            converted = (char)(firstLetter+64);
            firstNumb = (int)(Math.random()*boundary);
    
            while(firstNumb == 0)
                firstNumb = (int)(Math.random()*boundary);
        }
        else
        {
            location[0] = ""+converted+firstNumb;    
        }
        System.out.println("First grid square: " + location[0]);
        // if(horz)
        // {
                // for loop, use length as limit
                // add one to the letters
        // }
        // else
            
        return location;   
    }

    private boolean overLapping()
    {
        // post-condition: returns whether the first-point will overlap with any other ship
        return overlap;
    }
}