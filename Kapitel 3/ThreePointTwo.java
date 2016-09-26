/* Write a method named printPowersOf10 that accepts a minimum number as an argument and prints each power of 10 from 10^5 (100000)
down to that minimum power, inclusive. For example, consider the following calls:

printPowersOf10(2);
printPowersOf10(3);

The preceding calls should produce the following output:
100000 10000 1000 100
100000 10000 1000

You may assume that the value passed to printPowersOf10 is between 0 and 5, inclusive of both. (The Math class may help you with this problem.
If you use it, you may need to cast its results from double to int so that you don't see a .0 after each number in your output.
Also try to write this program without using the Math class) */

public class ThreePointTwo
{
   public static void main(String[] args)
   {
      printPowersOf10(2);
      printPowersOf10(3);
   }
   
   public static void printPowersOf10(int number)
   {
      for(int i = 5; i >= number; i--)
      {
         int power = (int) Math.pow(10, i);
         System.out.print(power + "   ");
      }
      System.out.println();
   }
}