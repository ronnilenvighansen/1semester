/* Write a method called season that takes as parameters two integers representing a month and day and return a String
indicating the season for that month and day. Assume that the month is specified as an integer between 1 and 12
(1 for January, 2 for February, and so on) and that the day of the month is a number between 1 and 31. If the date fakks between 12/16 and 3/15,
the method should return "winter". If the date falls between 3/16 and 6/15, the method should return "spring". If the date falls between
6/16 and 9/15, the method should return "summer". And if the date falls between 9/16 and 12/15, the method should return "fall". */

import java.util.*;

public class FourPointThree
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      int first = console.nextInt();
      int second = console.nextInt();
      season(first, second);
      System.out.println("The season is " + season(first, second));
      
   }
   
   public static String season(int first, int second)
   {
      if((first >= 12 || first <= 3) && (second >= 16 || second <= 15))
      {
         return "winter";
      }
      else if ((first >= 3 && first <= 6) && (second >= 16 || second <= 15))
      {
         return "spring";
      }
      else if ((first >= 6 && first <= 9) && (second >= 16 || second <= 15))
      {
         return "summer";
      }
      else
      {
         return "fall";
      }
   }
}