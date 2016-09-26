/* Write a for loop that produces the following output:

289 256 225 196 169 144 121 100 81 */

public class TwoPointTwo
{
   public static void main(String [] args)
   {
   int j = 289;
   int k = 33;
      for(int i = 1; i <= 9; i++)
      {
         System.out.print(j + " ");
         j -= k;
         k -= 2;
      }
   }
}