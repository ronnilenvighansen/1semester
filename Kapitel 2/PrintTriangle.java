/* Write a method called printTriangle that produces the following output:
-----1-----
----123----
---12345---
--1234567--
-123456789-

Use nested for loops to capture the structure of the figure */

public class PrintTriangle
{
   public static void main(String[] args)
   {
      for(int i = 1; i <= 5; i++)
      {
         for(int j = 5-i; j >= 0; j--)
         {
            System.out.print("-");
         }
         for(int k = 1; k <= i*2-1; k++)
         {
            System.out.print(k);
         }
         for(int j = 5-i; j >= 0; j--)
         {
            System.out.print("-");
         }
         System.out.println();
      }
   }
}