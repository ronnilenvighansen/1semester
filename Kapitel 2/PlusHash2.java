public class PlusHash2
{
   public static final int HEIGHT1 = 4;
   public static final int HEIGHT2 = 8;
   
   public static void main(String[] args)
   {
      firstPyramid();
      System.out.println();
      secondPyramid();
   }
   
   public static void firstPyramid()
   {
      for(int i = 1; i <= HEIGHT1; i++)
      {
         for(int j = HEIGHT1-i; j >= 1; j--)
         {
            System.out.print("<<");
         }
         
         for(int k = 2; k <= 2 * i; k++)
         {
            System.out.print("++");
         }
         
         for(int l = HEIGHT1-i; l >= 1; l--)
         {
            System.out.print(">>");
         }

         System.out.println();
      }
   }
   
   public static void secondPyramid()
   {
      for(int i = 1; i <= HEIGHT2; i++)
      {
         for(int j = HEIGHT2-i; j >= 1; j--)
         {
            System.out.print("<<");
         }
         
         for(int k = 2; k <= 2 * i; k++)
         {
            System.out.print("++");
         }
         
         for(int l = HEIGHT2-i; l >= 1; l--)
         {
            System.out.print(">>");
         }

         System.out.println();
      }
   }
}