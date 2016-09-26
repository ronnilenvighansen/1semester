/* Write a method called shrink that accepts an array of integers as a parameter and returns a new array containing the result of replacing
each pair of integers with the difference of that pair. For example, if an array called list stores the values
{2, 5, 4, 3, 67, 89, 43, 35, 11, 9], then the call if shrink(list) should return a new array containing
[-3, 1, -22, 8, 2]. The first pair from the original list is given as -3 (2 - 5), the second is given as 1 (4 - 3), and so on. If the list
stores an odd number of elements, the final element is not considered. For example, if the list had been [5, 4, 3, 2, 1], then the call
would return [1, 1, 1]. Your method should not change the array that is passed as a parameter. */

import java.util.*;

public class SevenPointFifteen
{
   public static void main(String[] args)
   {
      int[] list1 = {2, 5, 4, 3, 67, 89, 43, 35, 11, 9};
      int[] list2 = {5, 4, 3, 2, 1};
      System.out.println(Arrays.toString(shrink(list1)));
      System.out.println(Arrays.toString(shrink(list2)));
   }
   
   public static int[] shrink(int[] list)
   {
      int i = 0;
      int j = 0;
      
      if(list.length % 2 == 0)
      {
         int[] array = new int[list.length / 2];
         
         while(i != array.length)
         {
            array[i] = list[j] - list[j+1];
            i++;
            j += 2;
         }
         return array;
      }
      
      else
      {
         int[] array = new int[list.length / 2 + 1];
         
         while(i != array.length)
         {
            if(i == array.length-1)
            {
               array[array.length-1] = list[list.length-1];
               break;
            }
            array[i] = list[j] - list[j+1];
            i++;
            j += 2;
         }
         return array;
      }
   }
}