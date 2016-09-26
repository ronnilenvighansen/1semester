/* Write a method called cointCoints that accepts a Scanner representing an input file whose data is a series of pairs of tokens, where each pair
begins with an integer and is followed by the type of coin, which will "pennies" (1 cent each), "nickels" (5 cents each), "dimes"
(10 cents each), or "quarters" (25 cents each), case-insensitively. Add up the cash values of all the coins and print the total money. For
example, if the input file contains the following text:

3 pennies 2 quarters 1 Pennies 23 NiCkeLs 4 DIMES

For the input above, your method should produce the following output:

Total money: $2.09 */

import java.io.*;
import java.util.*;

public class SixPointFour
{
   public static final double PENNIES = 0.01;
   public static final double NICKELS = 0.05;
   public static final double DIMES = 0.10;
   public static final double QUARTERS = 0.25;
   
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("coins.txt"));
      cointCoins(input);
   }
   
   public static void cointCoins(Scanner input)
   {
      int number = 0;
      double sum = 0.0;
      String word = "";
      
      while(input.hasNext())
      {
         number = input.nextInt();
         word = input.next().toUpperCase();
         if(word.equals("PENNIES"))
         {
            sum += (number * PENNIES);
         }
         
         else if(word.equals("NICKELS"))
         {
            sum += (number * NICKELS);
         }
         
         else if(word.equals("DIMES"))
         {
            sum += (number * DIMES);
         }
         
         else if(word.equals("QUARTERS"))
         {
            sum += (number * QUARTERS);
         }
      }
      System.out.printf("Total money: %2.2f.", sum);
   }
}