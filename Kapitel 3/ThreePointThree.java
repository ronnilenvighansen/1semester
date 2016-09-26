/* Write a method called printPowersOfN that accepts a base and an exponent as arguments and prints each power of the base from base^0 (1)
up to that maximum power, inclusive. For example, consider the following calls:

printPowersOfN(4, 3);
printPowersOfN(5, 6);
printPowersOfN(-2, 8);

These calls should produce the following output:

1 4 16 64
1 5 25 125 525 3125 15625
1 -2 4 -8 16 -32 64 -128 256

You may assume that the value passed to printPowersOfN has a value of 0 or greater. (The Math class may help you with this problem.
If you use it, you may need to cast its results from double to int so that you don't see a .0 after each number in your output.
Also try to write this program without using the Math class) */

public class ThreePointThree
{
   public static void main(String[] args)
   {
      printPowersOfN(4, 3);
      printPowersOfN(5, 6);
      printPowersOfN(-2, 8);
   }
   
   public static void printPowersOfN(int number1, int number2)
   {
      for(int i = 0; i <= number2; i++)
      {
         int power = (int) Math.pow(number1, i);
         System.out.print(power + " ");
      }
      System.out.println();
   }
}