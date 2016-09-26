/* Write a method called hopscotch that accepts an integer number of "hops" as its parameter and prints a pattern of numbers that resembles
a hopscotch board. A "hop" is a three-number sequence where the output shows two numbers on a line, followed by one number on its own line.
0 hops is a board up to 1; one hop is a board up to 4; two hops is a board up to 7; and so on. For example, the call of hopscotch (3);
should print the following output:

   1
2     3 
   4
5     6
   7
8     9
  10 */
  
public class FivePointTen
{
   public static void main(String[] args)
   {
      hopscotch(3);
   }
   
   public static void hopscotch(int hop)
   {
      int n = 1;
      int i = 0;
      while(i != hop)
      {
         System.out.println("   " + n);
         System.out.println((n+1) + "     " + (n+2));
         n += 3;
         i++;
      }
      System.out.println("  " + n);
   }
}