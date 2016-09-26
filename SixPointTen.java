/* Modify the preceding wordWrap method so that it outputs the newly wrapped text back into the original file. (Be careful--don't output into a
file while you are reading it!) Also, modify it to use a class constant for the maximum line length rather than hard-coding 60. */

import java.io.*;
import java.util.*;

public class SixPointTen
{
   public static final int MAXLINE = 60;
   
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("wraptwo.txt"));
      PrintStream output = new PrintStream(new File("wraptwo.txt"));
      wordWrap(input, output);
   }
   
   public static void wordWrap(Scanner input, PrintStream output)
   {
      String word = "";
      while(input.hasNext())
      {
         for(int i = 0; i < MAXLINE; i++)
         {
            if(input.hasNext())
            {
               word = "";
               word += input.next();
               System.out.print(word);
            }
            
            else
            {
               break;
            }
         }
      }
      output.println(word);
   }

}