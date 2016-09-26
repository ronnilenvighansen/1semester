/* Write a method named printEvenNumbers that accepts a maximum number as an argument and prints every even number
from 2 up to that maximum, inclusive, boxed by the curly braces. For example, consider the following calls:

printEvenNumbers(8);
printEvenNumbers(12);

The preceding calls shoukd produce the following output:

{2} {4} {6} {8}
{2} {4} {6} {8} {10} {12}  

You may assume that the value passed to printEvenNumbers has a value of 2 or greater */

public class ThreePointOne
{   
   public static void main(String[] args)
   {
      printEvenNumbers(8);
      printEvenNumbers(12);
   }
   
   public static void printEvenNumbers(int number)
   {
      for(int i = 2; i <= number; i += 2)
      {
         System.out.print("{" + i + "} ");
      }
      System.out.println();
   }
   
   
}