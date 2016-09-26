/* Write a method called least that returns the least frequently occurring element of an array of integers. Assume that the array has at
least one element and that every element in the array has a value between 0 and 50 inclusive. Break ties by choosing the higher value.
For example, if the array passed contains the values [32, 21, 9, 9, 32], your values should return 21 and if the array passed contains
values [43, 19, 7, 11, 27], your method should return 43. (Hint: You may wish to look at the Tally program from this chapter to get an
idea how to solve this problem.) */

import java.util.*;

public class SevenPointFive
{
   public static final int MIN = 0;
   public static final int MAX = 50;
   
   public static void main(String[] args)
   {
      int[] array1 = {32, 21, 9, 9, 32};
      int[] array2 = {43, 19, 7, 11, 27};
      System.out.print(least(array1));
   }
   
   public static int least(int[] array)
   {
      Arrays.sort(array);
      
      int i = 0;
      int j = 0;
      
      while(i != array[i])
      {
         i = array[i];
         
         while(i == array[i])
         {
            if(i == array[i])
            {
            
            }
         
            else
            {
               i++;
            }
         }
      }
      int[] array3 = new int[i];
      return i;
   }
}