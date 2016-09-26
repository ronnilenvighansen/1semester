/* Write a method called quadSpaces that accepts a Scanner representing an input file as its parameter, then reads that file and outputs it with
all its tokens separated by four spaces, incrementing/decrementing any sequences of multiple spaces into four spaces. For example, consider
the following text:
    Betty    bought    some    butter.

If this text were a line in the file, the same should be output as follows:

Betty    bought    some    butter. */

import java.io.*;
import java.util.*;

public class SixPointFive
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("quad.txt"));
      quadSpaces(input);
   }
   
   public static void quadSpaces(Scanner input)
   {
      String word = "";
      
      word = input.next();
      System.out.print(word);
      while(input.hasNext())
      {
         word = input.next();
         System.out.print("    " + word);
      }
   }
}