/* Write a method called coinFlip that accepts a Scanner representing an input file of coin flips that are heads (H) or tails (T). Consider each
line to be a seperate set of coin flips and output the number and percentage of heads in that line. If it is more than 50&, print "You win!".
Consider the following file:

H T H H T
T t    t  T h  H 

For the input above, your method should produce the following output:

3 heads (60.0%)
You win!

2 heads (33.3%) */

import java.io.*;
import java.util.*;

public class SixPointFifteen
{
   public static final double DRAW = 50.0;
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("coinflip.txt"));
      coinFlip(input);
   }
   
   public static void coinFlip(Scanner input)
   {
      while(input.hasNextLine())
      {
         String word = "";
         String wordUpper = "";
         char upper;
         int count = 0;
         int headsCount = 0;
         double percent = 0.0;
         
         word = input.nextLine();
         wordUpper = word.toUpperCase();
         
         for(int i = 0; i < wordUpper.length(); i++)
         {
            upper = wordUpper.charAt(i);
            
            if(upper == ' ')
            {
               count--;
            }
            
            else if(upper == 'H')
            {
               headsCount++;
            }
            count++;
         }
         percent = ((double)headsCount / (double)count) * 100;
         System.out.printf("%d heads (%2.2f%%)\n", headsCount, percent);
         if(percent > DRAW)
         {
            System.out.println("You win!");
         }
         System.out.println();
      }
   }
}