/* Write a method called hasMidpoint that accepts three integers as parameters and returns true if one of the integers is the midpoint between
the other two integers; that is, if one integer is exactly halfway between them. Your method should return false if no such midpoint exists.
For example, the call hasMidpoint(7, 4, 10) should return true because 7 is halfway between 4 and 10. By contrast, the call
hasMidpoint(9, 15, 8) should return false because no integer is half between the other two. The integers could be passed in any order; the
midpoint could be the 1st, 2nd, or 3rd. You must check all cases. If your method is passed three of the same value, return true. */

public class FivePointFourteen
{
   public static void main (String[] args)
   {
      System.out.print(hasMidpoint (16, 11, 6));
   }       
   
   public static boolean hasMidpoint(int a, int b, int c) 
   {    
      int min = Math.min(a, Math.min(b, c));
      int max = Math.max(a, Math.max(b, c));
      int mid = 0;   
      int temp1 = Math.min(a, b);
      int temp2 = Math.min(a, c);
      mid = Math.max(temp1, temp2);
      
      if (max-mid == mid-min)
      {
         return true;
      }
      
      else 
      { 
         return false;   
      }
         
   }   
}