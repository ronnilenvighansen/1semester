/* Write a method called sortAndAppend that accepts two integer arrays as parameters and returns a new array that contains the result of
appending the two arrays in a sorted manner. For exampple, if arrays list1 and list2 store [3, 5, 7] and [1, 2, 3, 4, 5] respectively,
the call of sortAndAppend(list1, list2) should return a new array containing [1, 2, 3, 3, 4, 5, 5, 7]. If the call had been 
sortAndAppend(list2, list1), the method should return the same array containing [1, 2, 3, 3, 4, 5, 5, 7]. */

import java.util.*;

public class SevenPointSixteen
{
   public static void main(String[] args)
   {
      int[] list1 = {3, 5, 7};
      int[] list2 = {1, 2, 3, 4, 5};
      System.out.println(Arrays.toString(sortAndAppend(list1, list2)));
      System.out.println(Arrays.toString(sortAndAppend(list2, list1)));
   }
   
   public static int[] sortAndAppend(int[] list1, int[] list2)
   {
      int[] list3 = new int[list1.length + list2.length];
      System.arraycopy(list1, 0, list3, 0, list1.length);
      System.arraycopy(list2, 0, list3, list1.length, list2.length);
      Arrays.sort(list3);
      return list3;
   }
}