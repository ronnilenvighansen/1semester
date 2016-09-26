/* Write a method called twoOdds that repeatedly generate a random number between 0 and 99 until the results are two odd numbers in a row.
You should use a Random object to make it equally likely that an even or an odd number will appear. Each time a number is generated, display
whether the number is even or odd. When two odd numbers in a row are generated, the method should print a congratulatory message. Here is a
possibleoutput of a call to the method:

Odd Even Odd Even Even Odd Odd
Two Odd numbers in a row! */

import java.util.*;

public class FivePointEleven
{
   public static void main(String[] args)
   {
      twoOdds();
   }
   
   public static void twoOdds()
   {
      Random n = new Random();
      int number = 0;
      String w1 = ("Even");
      String w2 = ("Odd");
      String w3 = ("");
      
      while(!(w2.equals(w3)))
      {
         number = n.nextInt(100);
         
         if(number % 2 == 0)
         {
            System.out.println(w1);
         }
         
         else
         {
            System.out.println(w2);
            number = n.nextInt(100);
            if(number % 2 == 0)
            {
               w3 = ("Even");
               System.out.println(w3);
            }
            
            else
            {
               w3 = ("Odd");
               System.out.println(w3);
            }
         }
      }
      System.out.println("Two Odd numbers in a row!");
   }
}