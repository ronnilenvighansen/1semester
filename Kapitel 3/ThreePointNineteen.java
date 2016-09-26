/* Write a method called printLowerCase that accepts a string as its parameter and prints the same thing with lowercase characters.
For example, a call of printLowercase("PROGRAMMING") should print "programming". If the empty string is passed,
the method should produce no output. */

public class ThreePointNineteen
{
   public static void main(String[] args)
   {
      printLowerCase("PROGRAMMING");
   }
   
   public static void printLowerCase(String word)
   {
      String s = word.toLowerCase();
      System.out.println(s);
   }
}