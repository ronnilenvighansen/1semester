/* Write a Java program called PlusHash that produces the following output:
<<<<<<<<<<++>>>>>>>>>>
<<<<<<<<++++++>>>>>>>>
<<<<<<++++++++++>>>>>>
<<<<++++++++++++++>>>>
<<++++++++++++++++++>>
++++++++++++++++++++++
Use nested for loops to capture the structure of the figure */

public class PlusHash
{
   public static void main(String[] args)
   {
      for(int i = 1; i <= 6; i++)
      {
         for(int j = 6-i; j >= 1; j--)
         {
            System.out.print("<<");
         }
         
         for(int k = 2; k <= 2 * i; k++)
         {
            System.out.print("++");
         }
         
         for(int l = 6-i; l >= 1; l--)
         {
            System.out.print(">>");
         }

         System.out.println();
      }
   }
}