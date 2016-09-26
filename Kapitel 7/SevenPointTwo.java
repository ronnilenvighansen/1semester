/* Write a method called product that finds the maximum and the minimum values in an array and returns the product of those maximum and
minimum values. For example, if an array called long contains the values [25, 85, 22, 15, 78, 27, 48], the call of product(long) should
return the product of 85 and 15 or 1275 (85 * 15). You may assume that the array has at least one element. */

import java.util.*;

public class SevenPointTwo
{
   public static void main(String[] args)
   {
      int[] data = {25, 85, 22, 15, 78, 27, 48};
      product(data);
   }
   
   public static void product(int[] data)
   {
      int min = 0;
      int max = 0;
      int product = 0;
      
      Arrays.sort(data);
      min = data[0];
      max = data[data.length-1];
      product = min * max;
      System.out.print("The product of " + min + " * " + max + " is " + product);
   }
}