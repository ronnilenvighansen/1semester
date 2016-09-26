/* Write a method called shortestName that accepts a Scanner for the console and an integer n as parameters and prompts for n names,
then prints the shortest name (the name that contains the least characters) in the format shown below, which might result from a call
of shortestName(console, 4);

name #1? John
name #2? Van
name #3? David
name #4? Christine

Van's name is shortest */

import java.util.*;

public class FourPointEleven
{
   public static void main(String[] args)
   {
      shortestName(4);
   }
   
   public static void shortestName(int names)
   {
      Scanner console = new Scanner(System.in);
      
      String small = ("");
      
      for(int i = 1; i <= names; i++)
      {
         System.out.print("name #" + i + "? ");
         String name = console.nextLine();
         int length = name.length();
         if(name.length() < length)
         {
            small = name;
         }
      }
      System.out.println(small + "'s name is shortest");
   }
}