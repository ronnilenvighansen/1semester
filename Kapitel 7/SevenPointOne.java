/* Write a method called firstIndexOf that accepts an array of integers and an integer value as its parameters and returns the first index
at which the value occurs in the array. The method should return -1 if the value is not found. For example, in  the array
[47, 58, 201, 98, 106, 58, 65], the first index of the value 58 is 1. */

public class SevenPointOne
{
   public static void main(String[] args)
   {
      firstIndexOf();
   }
   
   public static void firstIndexOf()
   {
      int target = 58;
      int[] data = {47, 58, 201, 98, 106, 58, 65};
      
      for(int i = 0; i < data.length; i++)
      {
         if(data[i] == target)
         {
            System.out.println(i);
            break;
         }
      }
   }   
}