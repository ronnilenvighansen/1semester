/* Write a method called removeOddLength that takes an ArrayList of strings as a parameter and removes all of the strings of odd length from the list. 
*/

import java.util.*;

public class TenPointThree
{
   public static void main(String[] args)
   {
      ArrayList<String> list = new ArrayList<String>();
      list.add("to");
      list.add("bee");
      list.add("or");
      list.add("not");
      list.add("to");
      list.add("bee");
      list.add("hamlet");
      removeOddLength(list);
   }
   
   public static void removeOddLength(ArrayList<String> list)
   {
      for(int i = 0; i < list.size(); i++)
      {
         if(list.get(i).length() % 2 == 1)
         {
            list.remove(i);
         }
      }
      System.out.println(list);
   }
}