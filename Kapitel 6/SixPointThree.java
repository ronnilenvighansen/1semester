/* Write a method called positiveSum that accepts a Scanner reading input from a file containing a series of integers, and print a message to the
console indicating whether the sum starting from the first number is ever positive. You should also returns true if a positive sum can be reached
and false if not. For example, suppose the file contains the following text:

-20 -5 -19 -27 -15 -3 4 19 38

Your method should consider the sum of just one number (-20), the first two numbers (-20 -5), the first three numbers (-20 -5 -19), and so on to
the end. None of these sums is positive, so the method would produce the following output and return false:

no positive sum

If the file instead contains the following numbers:

-20 -8 -11 -4 90 -10 17 42 98

The method finds that a positive sum of 47 is reached after adding the first five numbers. It should outpot the following to the console and
return true:

sum of 47 after 5 steps */

import java.io.*;
import java.util.*;

public class SixPointThree
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner inputOne = new Scanner(new File("positiveone.txt"));
      Scanner inputTwo = new Scanner(new File("positivetwo.txt"));
      positiveSumOne(inputOne);
      System.out.println();
      positiveSumTwo(inputTwo);
   }
   
   public static boolean positiveSumOne(Scanner inputOne)
   {
      System.out.println("First textfile:");
      int sum = 0;
      int count = 0;
      
      while(inputOne.hasNext())
      {
         sum += inputOne.nextInt();
         count++;
         
         if(sum >= 0)
         {
            System.out.println("sum of " + sum + " after " + count + " steps");
            break;
         }
      }
            
      if(sum < 0)
      {
         System.out.println("no positive sum");
         return false;
      }
      
      else
      {
         return true;
      }
   }
   
   public static boolean positiveSumTwo(Scanner inputTwo)
   {
      System.out.println("Second textfile:");
      int sum = 0;
      int count = 0;
      
      while(inputTwo.hasNext())
      {
         sum += inputTwo.nextInt();
         count++;
         
         if(sum >= 0)
         {
            System.out.println("sum of " + sum + " after " + count + " steps");
            break;
         }
      }
            
      if(sum < 0)
      {
         System.out.println("no positive sum");
         return false;
      }
      
      else
      {
         return true;
      }
   }
}