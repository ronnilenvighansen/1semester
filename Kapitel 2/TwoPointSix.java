/* Write nested for loops to produce the following output:
7777777
666666
55555
4444
333
22
1 */

public class TwoPointSix
{
   public static void main(String[] args)
   {
   int k = 7;
      for(int i = 0; i < 7; i++)
      {
         for(int j = 7-i; j >= 1; j--)
         {
            System.out.print(k);
         }
         System.out.println();
         k -= 1; 
      }
   }
}