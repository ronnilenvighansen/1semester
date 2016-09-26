/* Write nested for loops to produce the following output:

55555
 4444
  333
   22
    1  */
    
public class TwoPointEight
{
   public static void main(String[] args)
   {
   int l = 5;
      for(int i = 0; i < 5; i++)
      {
         for(int j = 4; j >= l; j--)
         {
            System.out.print(" ");
         }
         for(int k = 5-i; k > 0; k--)
         {
            System.out.print(l);
         } 
         System.out.println();
         l -= 1;
      }
   }
}