/* Write a method called readWriteFile that accepts a Scanner for an input file and a PrintStream for an output file as its parameters, reads
that file and then writes its entire text contents in the output file. */

import java.io.*;
import java.util.*;

public class SixPointSix
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("hello1.txt"));
      PrintStream output = new PrintStream(new File("hello2.txt"));
      readWriteFile(input, output);
   }
   
   public static void readWriteFile(Scanner input, PrintStream output)
   {
      String word = "";
      
      while(input.hasNext())
      {
         word = input.next();
         output.print(word);
      }
   }
}