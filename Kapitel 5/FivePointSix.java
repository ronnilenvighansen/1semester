/* Write a method called makeTwoGuesses that guesses two numbers between 1 and 20 inclusive until the sum of two numbers is exactly 20.
It should report each guess and at the end should report the total number of guesses made. Here is a sample execution:

guess1 + guess2 = 10
guess1 + guess2 = 2
guess1 + guess2 = 15
guess1 + guess2 = 15
guess1 + guess2 = 20
total guesses = 5 */

import java.util.*;

public class FivePointSix
{
   public static void main(String[] args)
   {
      makeTwoGuesses();
   }
   
   public static void makeTwoGuesses()
   {
      Random n = new Random();
      int count = 0;
      int sum = 0;
      
      while(sum != 20)
      {
         sum = n.nextInt(21) + n.nextInt(21);
         System.out.println("guess1 + guess2 = " + sum);
         count++;
      }
      System.out.println("Total guesses = " + count);
   }
}