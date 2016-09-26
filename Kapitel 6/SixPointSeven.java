/* Write a method called flipLines that accepts a Scanner for an input file and writes to the console the same file's contents with each pair
of lines reversed in order. If the file contains an odd number of lines, leave the last line unmodified. For example, if the file contains:

Twas brillig and the slighty toves
did gyre and gimble in the wabe.
All mimsey were the borogroves,
and the mome raths outgrabe.

your method should return the following output:

did gyre and gimble in the wabe.
Twas brillig and the slighty toves
and the mome raths outgrabe.
All mimsey were the borogroves, */

import java.io.*;
import java.util.*;

public class SixPointSeven
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("flip.txt"));
      flipLines(input);
   }
   
   public static void flipLines(Scanner input)
   {
      while(input.hasNext())
      {
         String s1 = "";
         String s2 = "";
         s1 += input.nextLine();
         s2 += input.nextLine();
         System.out.println(s2);
         System.out.println(s1);
      }
   }
}