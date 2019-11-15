// public class BattleshipObj
// {
//     static boolean horz;
//     static int length;

//     public static void create()
//     {
//         int randNum = (int)(Math.random()*2);
//         if(randNum == 0)
//             horz = true;
//         else
//             horz = false;
//         // need to set length minimum boundary
//         length = (int)(Math.random()*6);
//         while(length < 2)
//         {
//             length = (int)(Math.random()*6);
//         }
//         place();
//     }

//     private static String[] place()
//     {
//         // store locations as Chars. ex: A7.
//         String[] location = new String[length];
//         int boundary = 10-length;
//         // System.out.println("Boundary: " + boundary);
//         // numbers 1-9
//         // ASCII from 
//         // if 1 ==> +64 ==> A (65)
//         // if 2 ==> +64 ==> B (66)...
//         int firstLetter = (int)(Math.random()*boundary);

//         while(firstLetter == 0)
//             firstLetter = (int)(Math.random()*boundary);

//         char converted = (char)(firstLetter+64);
//         int firstNumb = (int)(Math.random()*boundary);

//         while(firstNumb == 0)
//             firstNumb = (int)(Math.random()*boundary);

//         location[0] = ""+converted+firstNumb;
//         System.out.println("First grid square: " + location[0]);

//         // if(horz == true)
//         // {

//         // }
//         return location;   
//     }

// }