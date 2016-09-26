/* Write a method called swapPairs that switches the order of values in an ArrayList of strings in a pairwise fashion. Your method should switch the
order of the first two values, then switch the order of the next two, then the next two, and so on. If the number of values in the list is odd, the
method should not move the final element. For example, if the list initially stores ["to", "be", "or", "not", "to", "be", "hamlet"], your method should
change the list's contents to ["be", "to", "not", "or", "be", "to", "hamlet"]. */

import java.util.*;

public class TenPointTwo
{
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<String>();
      words.add("to");
      words.add("be");
      words.add("or");
      words.add("not");
      words.add("to");
      words.add("be");
      words.add("hamlet");
      swapPairs(words);
   }
   
   public static void swapPairs(ArrayList<String> words)
   {
      String word = "";
      
      if(words.size() % 2 == 0)
      {
         for(int i = words.size() - 1; i >= 0; i -= 2)
         {
            word = words.get(i-1);
            words.remove(i-1);
            words.add(i, word);
         }
      }
      
      else
      {
         for(int i = words.size() - 2; i >= 0; i -= 2)
         {
            word = words.get(i-1);
            words.remove(i-1);
            words.add(i, word);
         }
      }
      System.out.println(words);
   }
}