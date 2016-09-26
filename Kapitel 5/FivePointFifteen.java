/* Write a method called dominant that accepts three integers as parameters and returns true if any one of the three integers is larger than the
sum of the other two integers. The integers might be passed in any order, so the largest value could be any of the three. For example, the call
dominant(4, 9, 2) returns true because 9 is larger than 4 + 2. Assume that none of the numbers is negative. */

public class FivePointFifteen
{
   public static void main(String[] args)
   {
      System.out.println(dominant(4, 9, 2));
   }
   
   public static boolean dominant(int n1, int n2, int n3)
   {
      return (n1 > (n2 + n3)) || (n2 > (n1 + n3)) || (n3 > (n1 + n2));
   }
}