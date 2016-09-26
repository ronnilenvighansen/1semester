/* Write a method called vowelCount that accepts a String as a parameter and produces and returns an array of integers representing the
counts of each vowel in the string. The array returned by your method should hold five elements: the first is the count of As, the second
is the count of Es, the third Is, the fourth Os, and the fifth Us. Assume the the string contains no uppercase letters. For example, the
call vowelCount("i think, therefore i am") should return the array [1, 3, 3, 1, 0]. */

import java.util.*;

public class SevenPointSeventeen
{
   public static final int NUMBEROFVOWELS = 5;
   public static void main(String[] args)
   {
      System.out.print(Arrays.toString(vowelCount("i think, therefore i am")));
   }
   
   public static int[] vowelCount(String s)
   {
      int[] vowels = new int[NUMBEROFVOWELS];
      int i = 0;
      
      while(i != s.length())
      {
         if(s.charAt(i) == 'a')
         {
            vowels[0]++;
         }
         
         else if(s.charAt(i) == 'e')
         {
            vowels[1]++;
         }
         
         else if(s.charAt(i) == 'i')
         {
            vowels[2]++;
         }
         
         else if(s.charAt(i) == 'o')
         {
            vowels[3]++;
         }
         
         else if(s.charAt(i) == 'u')
         {
            vowels[4]++;
         }
         i++;
      }
      return vowels;
   }
}