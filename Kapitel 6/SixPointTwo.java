/* Write a method called oddNumbers that accepts a Scanner reading input from a file with a series of integers, and report various statistics
about the integers to the console. Report the total number of numbers, the sum of the numbers, the count of odd numbers and the percent of odd
numbers. For example, if the input file contains the following text:

3 5 4 12 7 11 14 73 5 17 29 24

Then the method should produce the following console output:

12 numbers, sum = 204
8 odds (66.67%) */

import java.io.*;
import java.util.*;

public class SixPointTwo
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("sequenceofnumbers.txt"));
      oddNumbers(input);
   }
   
   public static void oddNumbers(Scanner input)
   {
      int number = 0;
      int numberCount = 0;
      int sum = 0;
      int oddCount = 0;
      double oddPercent = 0.0;
      
      while(input.hasNext())
      {
         number = input.nextInt();
         numberCount++;
         if(number % 2 == 1)
         {
            sum += number;
            oddCount++;
         }
         
         else
         {
            sum += number;
         }
      }
      
      oddPercent = ((double)oddCount / (double)numberCount) * 100;
      System.out.println(numberCount + " numbers, sum = " + sum);
      System.out.printf("%d odds (%2.2f%%)", oddCount, oddPercent);
   }
}