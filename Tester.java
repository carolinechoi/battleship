import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        System.out.println("Shall we play a game?");
        Battleship num1 = new Battleship();
        System.out.println("Length: " + num1.length);
        System.out.println("Horizontal?: " + num1.horz);
    }
}