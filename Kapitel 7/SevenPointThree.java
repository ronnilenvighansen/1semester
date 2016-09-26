/* Write a method called evensInRange that accepts an array of integers, a minimum value, and a maximum value as parameters and returns
the count of how many even numbers from the array fall between the minimum and maximum(inclusive). For example, in the array
[90, 85, 4, 35, -76, 9, 23, 3], for minimum value 3 and maximum value 35, there is one even number whose value falls between 3 and 35. */

import java.util.*;

public class SevenPointThree
{
   public static void main(String[] args)
   {
      int[] data = {90, 85, 4, 35, -76, 9, 23, 3};
      int min = 0;
      int max = 0;
      System.out.print(evensInRange(data, min, max));
   }
   
   public static int evensInRange(int[] data, int min, int max)
   {
      Arrays.sort(data);
      min = data[0];
      max = data[data.length-1];
      int count = 0;
      
      for(int i = 0; i < data.length; i++)
      {
         if(data[i] % 2 == 0 && data[i] > data[0] && data[i] < data[data.length-1])
         {
            count++;
         }
      }
      return count;
   }
}