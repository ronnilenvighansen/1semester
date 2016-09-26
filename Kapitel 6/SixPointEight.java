/* Write a method called doubleSpace that accepts a Scanner for an input file and a PrintStream for an output file as its parameters, writing
into the output file a double-spaced version of the text in the input file. You can achieve this task by inserting a blank line between each 
line of output. */

import java.io.*;
import java.util.*;

public class SixPointEight
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("words.txt"));
      PrintStream output = new PrintStream(new File("words2.txt"));
      doubleSpace(input, output);
   }
   
   public static void doubleSpace(Scanner input, PrintStream output)
   {
      if(input.hasNext())
      {
         output.print(input.next());
         while(input.hasNext())
         {
            output.print("  " + input.next());
         }
      }
      output.println();
   }
}