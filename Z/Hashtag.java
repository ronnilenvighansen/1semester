public class Hashtag
{
   public static void main (String[] args)
   {
      System.out.println(hasMidpoint(3, 1, 3));
      System.out.println(hasMidpoint(1, 3, 1));
      System.out.println(hasMidpoint(21, 9, 58));
      System.out.println(hasMidpoint(2, 8, 16));
   }       
   
   public static boolean hasMidpoint(int n1, int n2, int n3) 
   {    
      int min = 0;
      int mid = 0;
      int max = 0;
      int temp1, temp2, temp3, temp4, temp5, temp6;
      temp1 = Math.min(n1, n2);
      temp2 = Math.min(n1, n3);
      temp3 = Math.min(n2, n3);
      temp4 = Math.max(n1, n2);
      temp5 = Math.max(n1, n3);
      temp6 = Math.max(n2, n3);
      min = Math.min(temp1, Math.min(temp2, temp3)); 
      mid = Math.max(temp1, Math.max(temp2, temp3));
      max = Math.max(temp4, Math.max(temp5, temp6));
      
      if (max-mid == mid-min)
      {
         return true;
      }
      
      else 
      { 
         return false;   
      }
         
   }   
}