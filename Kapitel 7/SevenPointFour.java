/* Write a method called reverseSorted that accepts an array of real numbers as a parameter and returns true if the list is in sorted in
decreasing order and false otherwise. For example, if arrays named array1 and array2 store [85.9, 76.8, 65.3, 2.8] and 
[6.7, 12.5, 89.7, 75.7, 34.7, 93.6] respectively, the calls reverseSorted(array1) and reverseSorted(array2) should return true and false
respectively. Assume the array has at least one element. A one-element array is considered to be sorted. */

import java.util.*;

public class SevenPointFour
{
   public static void main(String[] args)
   {
      double[] array1 = {85.9, 76.8, 65.3, 2.8};
      double[] array2 = {6.7, 12.5, 89.7, 75.7, 34.7, 93.6};
      System.out.println(reverseSorted(array1));
      System.out.println(reverseSorted(array2));
   }
   
   public static boolean reverseSorted(double[] array)
   {
      int j = 0;
      int count = 0;
      double[] array3 = Arrays.copyOf(array, array.length);
      Arrays.sort(array3);
      
      for(int i = array.length-1; i >= 0; i--)
      {
         if(array[j] == array3[i])
         {
            count++;
         }
         j++;
      }
         
      if(count == array.length)
      {
         return true;
      }
      
      else
      {
         return false;
      }
   }
}