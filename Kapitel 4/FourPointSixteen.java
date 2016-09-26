/* Write a method called printPalindrome that accepts a Scanner for the console as a parameter, prompts the user to enter one or more words,
and prints wherther the entered String is a palindrome (i.e,m reads the same forward as it does backwars, like "abba" or "racecar").
For an added challenge, make the code case-insensitive, so that words like "Abba" and "Madam" will be considered palindromes. */

import java.util.*;

public class FourPointSixteen
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      printPalindrome(console);
   }
   
   public static void printPalindrome(Scanner console)
   {
      String s1 = console.nextLine();
      String reverse = new StringBuilder(s1).reverse().toString();
      if(s1.equals(reverse))
      {
         System.out.print(s1 + " is a palindrome");
      }
      else
      {
         System.out.print(s1 + " is not a palindrome");
      }
   }
}