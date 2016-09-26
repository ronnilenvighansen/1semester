/* Write a method called boyGirl that accepts a Scanner that is reading its input from a file containing a series of names followed by 
integers. The names alternate between boys' names and girls' names. Your method should compute the absolute difference between the sum of the
boys' integers and the sum of the girls' integers. The input could end with either a boy or girl; you may not assume that it contains an
even number of names. For example, if the input file contains the following text:

Erik 3 Rita 7 Tanner 14 Jillyn 13 Curtis 4 Stefanie 12 Ben 6

Then the method should produce the following console output, since the boys' sum is 27 and the girls' sum is 32:

4 boys, 3 girls
Difference between boys' and girls' sums: 5 */

import java.io.*;
import java.util.*;

public class SixPointOne
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("names.txt"));
      boyGirl(input);
   }
   
   public static void boyGirl(Scanner input)
   {
      String name = ("");
      int number = 0;
      int sum1 = 0;
      int sum2 = 0;
      int boysCount = 0;
      int girlsCount = 0;
      int count = 0;
      int difference = 0;
      
      while(input.hasNext())
      {
         if(count%2 == 0)
         {
            name = input.next();
            number = input.nextInt();
            sum1 += number;
            boysCount++;
            count++;
         }
         
         else if(count%2 == 1)
         {
            name = input.next();
            number = input.nextInt();
            sum2 += number;
            girlsCount++;
            count++;
         }
      }
      System.out.println(boysCount + " Boys, " + girlsCount + " Girls");
      if(sum1 >= sum2)
      {
         difference = sum1 - sum2;
         System.out.println("Difference between boys' and girls' sums: " + difference);
      }
      
      else
      {
         difference = sum2 - sum1;
         System.out.println("Difference between boys' and girls' sums: " + difference);
      }
   }
}