import java.util.*;

public class Faisal
{
   public static void main(String[] args)
   {
      /*for(int i = 1; i <= 10; i++)
      {
         System.out.print(i + " ");
      }
      
      System.out.println();
      
      printReverse();
      
      System.out.println();
      
      Scanner console = new Scanner(System.in);
      livia(console);
      
      System.out.println();*/
      
      julie();
   }
   
   public static void printReverse()
   {
      for(int j = 10; j >= 1; j--)
      {
         System.out.print(j + " ");
      }
   }
   
   public static void livia(Scanner console)
   {
      int n1 = console.nextInt();
      int n2 = console.nextInt();
      
      if(n1 <= n2)
      {
         for(int k = n1; k <= n2; k++)
         {
            System.out.print(k + " ");
         }
      }
      
      else
      {
         for(int l = n1; l >= n2; l--)
         {
            System.out.print(l + " ");
         }
      }
   }
   
   public static void julie()
   {
      int n = 100;
      while(n != 50)
      {
         System.out.println(n + " ");
         n--;
      }
   }
}