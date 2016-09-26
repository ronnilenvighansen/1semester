/* Write a method called printProduct that uses a sentinel loop to repeatedly prompt the user for numbers. Once the user types any number less
than zero, the method should display the product of all nonnegative numbers typed. Display the product as an integer. Here is a simple dialogue
with the user:

Type a number: 3
Type a number: 6
Type a number: 9
Type a number: -2
Product is 162 */

import java.util.*;

public class FivePointTwelve
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      printProduct(console);
   }
   
   public static void printProduct(Scanner console)
   {
      int number = 0;
      int product = 1;
      while(number >= 0)
      {
         System.out.print("Type a number: ");
         number = console.nextInt();
         if(number >= 0)
         {
            product *= number;
         }
      }
      System.out.println("Product is " + product);
   }
}