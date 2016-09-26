/* Write a variation of the method from the last excercise called smallestAbsVal that takes three ints and returns the smallest
of their three absolute values. For example a call of smallestAbsVal(1, 9, -11) would return 1, and a call of smallestAbsVal (-8, 2, 12)
would return 2. */

public class ThreePointSeven
{
   public static void main(String[] args)
   {
      smallestAbsVal(1, 9, -11);
      smallestAbsVal(-8, 2, 12);
   }
   
   public static void smallestAbsVal(int number1, int number2, int number3)
   {
      int n1 = (int)Math.abs(number1);
      int n2 = (int)Math.abs(number2);
      int n3 = (int)Math.abs(number3);
      int small1 = (int)Math.min(n1, n2);
      int small2 = (int)Math.min(n1, n3);
      int smallest = (int)Math.min(small1, small2);
      System.out.println(smallest);
   }
}