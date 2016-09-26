import java.util.*;
import java.io.*;

public class SixPointThirteen
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("code.txt"));
      countAndStripComments(input);
   }
   
   public static void countAndStripComments(Scanner input)
   {
      String word1 = "";
      String word2 = "";
      int count = 0;
      
      while(input.hasNext())
      {
         word1 = input.nextLine();
         if(word1.contains("/*") == true || word1.contains("//") == true)
         {
            count++;
         }
         word2 = word1.replaceAll("//*.*/.*","");
         System.out.println(word2);
         System.out.println();
      }
      System.out.println("Number of comments removed = " + count);
   }
}