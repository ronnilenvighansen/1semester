/* Write a complete program called ExamResult with the behaviour shown below. Read user input for a student's internal test score
and final exam score. An internal test score below 20 will cause the student to be failed; final exam score below 40 will also cause
the student to be failed. Otherwise the student has passed.

Semester Examination Results!
What is your internal test score? 21
What is your final exam score? 69
You have passed! */

import java.util.*;

public class ExamResults
{
   public static void main(String[] args)
   {
      passOrFail();
   }
   
   public static void passOrFail()
   {
      System.out.println("Semester Examination Results!");
      Scanner console = new Scanner(System.in);
      System.out.print("What is your internal test score? ");
      int internal = console.nextInt();
      System.out.print("What is your final exam score? ");
      int exam = console.nextInt();
      if(internal >= 20 && exam >= 40)
      {
         System.out.println("You Have Passed!");
      }
      else
      {
         System.out.println("You Have Failed!");
      }
   }
}