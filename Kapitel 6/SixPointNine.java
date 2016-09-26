/* Write a method called wordWrap that accepts a Scanner representing an input file as its parameter and outputs each line of the file to the
console, word-wrapping all lines that are longer than 60 characters. For example, if a line contatins 112 characters, the method should replace
it with two lines: one containing the first 60 characters and another containg the  final 52 characters. A line containing 217 characters should
be wrapped into four lines: three of length 60 and a final line of length 37. */

import java.io.*;
import java.util.*;

public class SixPointNine
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("wrap.txt"));
      wordWrap(input);
   }
   
   public static void wordWrap(Scanner input)
   {
      while(input.hasNext())
      {
         for(int i = 0; i < 60; i++)
         {
            if(input.hasNext())
            {
               String word = "";
               word += input.next();
               System.out.print(word);
            }
            
            else
            {
               break;
            }
         }
         System.out.println();
      }
   }
}