/* Write a method called getGrade that accepts an integer representing a student's grade in a course and returns that student's numerical
course grade. The grade can be between 0.0 (failing) and 4.0 (perfect). Assume that scores are in the range of 0 to 100 and that grades
are based on the following scale. For an added challenge, make your method throw an illegalArgumentException if the user passes a grade
lower than 0 or higher than 100.

Score                Grade
< 60                 0.0
60-62                0.7
63                   0.8
64                   0.9
65                   1.0
...
92                   3.7
93                   3.8
94                   3.9
>= 95                4.0 */

import java.util.*;

public class FourPointFifteen
{
   public static void main(String [] args)
   {
      System.out.println("What is your score?");
      getGrade();
   }
   
   public static void getGrade()
   {
      Scanner console = new Scanner(System.in);
      int score = console.nextInt();
      double grade = 0.0; 
      
      if(score < 60)
      {
         System.out.println("0.0");
      }
      else if(score >= 60 && score <= 62)
      {
         System.out.println("0.7");
      }
      else if(score >= 63 && score <= 94)
      {
         for(int i = 63; i <= 94; i++)
         {
            if(i == score)
            {
               grade = 0.8 + (0.1 * (score - 63));
               System.out.printf("%1.1f\n", grade);
            }
         }
      }
      else if(score >= 95 && score <= 100)
      {
         System.out.println("4.0");
      }
      else
      {
         System.out.println("You have printed an invalid score");
      }
   }
}