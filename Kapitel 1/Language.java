/* Write a complete Java program called Language that prints the following output:

What type of a programming language is Java?
Java is an Object Oriented Programming Language!

What type of a programming language is Java?
Java is an Object Oriented Programming Language! */

public class Language
{
   public static void main(String[] args)
   {
      twoLines();
      System.out.println();
      twoLines();
   }
   
   public static void twoLines()
   {
      System.out.println("What type of a programming language is Java?");
      System.out.println("Java is an Object Oriented Programming Language!");
   }
}