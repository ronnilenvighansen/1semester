/* Write a method called totalVowels that takes an ArrayList of strings as a parameter and returns the total number of vowel characters (a, e, i, o, u) in all
Strings in the list. If your method is passed an empty ArrayList, it should return 0. */

import java.util.*;

public class TenPointOne
{  
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<String>();
      words.add("four");
      words.add("seven");
      words.add("JakOb");
      System.out.println(totalVowels(words));
   }
   
   public static int totalVowels(ArrayList<String> words)
   {
      int count = 0;
      String word = "";
      
      for(int i = 0; i < words.size(); i++)
      {
         word = words.get(i).toLowerCase();
         for(int j = 0; j < word.length(); j++)
         {   
            if(word.charAt(j) == 'a' || 
               word.charAt(j) == 'e' || 
               word.charAt(j) == 'i' || 
               word.charAt(j) == 'o' || 
               word.charAt(j) == 'u')
            {
               count++;
            }
         }
      }
      return count;
   }
}