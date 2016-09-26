/* Write a method called printEven that accepts two integers and as arguments and prints the sequence of even numbers between the two arguments,
enclosed in square brackets. Print an increasing sequence if the first argument is smaller than the second; otherwise, print a decreasing
sequence. If the two numbers are the same, that number should be printed only if it is even. Here are some sample calls to printEven:

printEven(1, 7);
printEven(21, 15);
printEven(2, 2);

The output produced from these calls should be the following sequences of numbers:

[ 2 4 6 ]
[ 20 18 16 ]
[ 2 ] */

public class FourPointSix
{
   public static void main(String[] args)
   {
      printEven(1, 7);
      printEven(21, 15);
      printEven(2, 2);
   }
   
   public static void printEven(int n1, int n2)
   {
      if(n1 <= n2)
      {
         if(n1 % 2 == 1)
         {
            n1 += 1;
         }
         System.out.print("[ ");
         for(int i = n1; i <= n2; i += 2)
         {
            System.out.print(i + " ");
         }
         System.out.print("]");
         System.out.println();
      }
      else
      {
         if(n1 % 2 == 1)
         {
            n1 -= 1;
         }
         System.out.print("[ ");
         for(int j = n1; j >= n2; j -= 2)
         {
            System.out.print(j + " ");
         }
         System.out.print("]");
         System.out.println();
      }
   }
}