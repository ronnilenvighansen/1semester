/* Write a method called diceProduct that accepts a Scanner for the console as a parameter and prompts for a desired product, then repeatedly
simulates the rolling of 2 six-sided dice until their product is the desired product. Here is a sample dialogue with the user:

Desired dice product: 24
3 and 1 = 3
3 and 5 = 15
6 and 1 = 6
3 and 4 = 12
6 and 2 = 12
6 and 4 = 24 */

import java.util.*;

public class FivePointSeven
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      diceProduct(console);
   }
   
   public static void diceProduct(Scanner console)
   {
      Random n = new Random();
      int desiredProduct = console.nextInt();
      int n1 = 0;
      int n2 = 0;
      int sum = 0;
      while(sum != desiredProduct)
      {
         n1 = n.nextInt(7);
         n2 = n.nextInt(7);
         sum = n1 * n2;
         System.out.println(n1 + " and " + n2 + " = " + sum);
      }
   }
}