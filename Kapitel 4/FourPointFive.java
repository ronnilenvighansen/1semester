/* Write a method called pow that accepts a base and an exponent as parameters and returns the base raised to the given power.
For example, the call pow(3, 4) should return 3 * 3 * 3 * 3, or 81. Assume that the base and exponent are nonnegative. */

public class FourPointFive
{
   public static void main(String[] args)
   {
      pow(3, 4);
   }
   
   public static void pow(int base, int exponent)
   {
      int sum = (int)Math.pow(base, exponent);
      System.out.println(sum);
   }
}