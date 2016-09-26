/* Write a method called consecutiveEven that accepts three integers as parameters and returns true if they are three consecutive even
numbers--that is, if the numbers can be arranged into an order such that, assuming some integer k, the parameters' values are k, k + 2 and
k + 4. Your method should return false if the integers are not consecutive even numbers. Note that order is not significant; your method
should return the same result for the same three integers passed in any order.

For example, the calls consecutiveEven (2, 4, 6), consecutiveEven (6, 2, 4), and consecutiveEven(-6, -4, -2) would return true. The calls
consecutiveEven(1, 2, 3), consecutiveEven(4, 2, 8), and consecutiveEven(6, 7, 9) would return false. */

import java.util.*;

public class FreeTime
{
   public static void main(String[] args)
   {
      
      System.out.println(consecutiveEven(2, 4, 6));
      System.out.println(consecutiveEven(6, 2, 4));
      System.out.println(consecutiveEven(-6, -4, -2));
      System.out.println(consecutiveEven(1, 2, 3));
      System.out.println(consecutiveEven(4, 2, 8));
      System.out.println(consecutiveEven(6, 7, 9));
   }
   
   public static boolean consecutiveEven(int n1, int n2, int n3)
   {
      int k1 = 0;
      int k2 = 0;
      int k3 = 0;
      int temp1, temp2, temp3, temp4, temp5, temp6;
      temp1 = Math.min(n1, n2);
      temp2 = Math.min(n1, n3);
      temp3 = Math.min(n2, n3);
      temp4 = Math.max(n1, n2);
      temp5 = Math.max(n1, n3);
      temp6 = Math.max(n2, n3);
      k1 = Math.min(temp1, Math.min(temp2, temp3)); 
      k2 = Math.max(temp1, Math.max(temp2, temp3));
      k3 = Math.max(temp4, Math.max(temp5, temp6));
      
      if(k1 % 2 == 0 && k2 == (k1 + 2) && k3 == (k1 + 4))
      {
         return true;
      }
      
      else
      {
         return false;
      }
      
   }
}