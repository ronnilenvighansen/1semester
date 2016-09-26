/* Write a method named smallerAbsVal that takes two ints as parameters and returns the smaller of the two absolute values.
A call of smallerAbsVal(1, 9) would return 1, and a call of smallerAbsVal(-8, 2) would return 2. */

public class ThreePointSix
{
   public static void main(String[] args)
   {
      smallerAbsVal(1, 9);
      smallerAbsVal(-8, 2);
   }
   
   public static void smallerAbsVal(int number1, int number2)
   {
      int n1 = (int)Math.abs(number1);
      int n2 = (int)Math.abs(number2);
      int small = (int)Math.min(n1, n2);
      System.out.println(small);
   }
}