/* Write a method called randomNumLines that prints between 10 and 20 random numbers having digits between "0" and "5", one per line.
Each number should have random length of up to 6 digits. */

import java.util.*;

public class FivePointFive
{
   public static void main(String[] args)
   {
      randomNumLines();
   }
   
   public static void randomNumLines()
   {
      Random n = new Random();
      for(int i = 0; i < n.nextInt(11)+10; i++)
      {
         for(int j = 0; j < n.nextInt(7); j++)
         {
            int number = n.nextInt(6);
            System.out.print(number);
         }
         System.out.println();
      }
      System.out.println();
   }
}