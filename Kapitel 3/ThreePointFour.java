/* Write a method called printDecrSquare that accepts a maximum and minimum integer and prints a square of lines of decreasing numbers.
The first line should start with the maximum, and each line that follows should start with the next-lower number. The sequence of numbers
on a line wraps back to the maximum after it hits the minimum. For example, the call:

printDecrSquare(8, 4);

should produce the following output:

87654
76548
65487
54876
48765

If the maximum passed is less than the minimum, the method produces no output */

public class ThreePointFour
{
   public static void main(String[] args)
   {
      printDecrSquare(8, 2);
   }
   
   public static void printDecrSquare(int maximum, int minimum)
   {  
      for(int i = 0; i <= 4; i++)
      {
         int n = maximum;
         for(int j = maximum-i; j >= minimum; j--)
         { 
            System.out.print(j);
         }
         
         for(int k = 0; k < i; k++)
         {
            System.out.print(n);
            n -= 1;
         }
         System.out.println();
      }
   }
}