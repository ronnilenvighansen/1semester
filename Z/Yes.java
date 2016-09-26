/* Write a static method named sequenceSum that prints terms of the following mathematical sequence:
1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + ...
Your method should accept a real number as a parameter representing a limit, and should add and print terms of the sequence 
until the sum of terms meets or exceeds that limit. 
For example, if your method is passed 2.0, print terms until the sum of those terms is at >= 2.0. 
You should round your answer to 3 digits past the decimal point.
The following is the output from the call  sequenceSum(2.0);
1 + 1/2 + 1/3 + 1/4 = 2.083 */

public class Yes
{
   public static void main(String[] args)
   {
      sequenceSum(2.0);
   }
   
   public static void sequenceSum(double number)
   {
      double i = 1.0;
      double j = 1.0;
      double sum = 0.0;
      
      if(number > i)
      {
         System.out.print(i + "/" + j);
         sum += i/j;
         j += 1;
         while(sum < number)
         {
            System.out.print(" + " + i + "/" + j);
            sum += i/j;
            j += 1.0;
         }
      System.out.printf(" = %1.3f\n", sum);
      }
   }
}