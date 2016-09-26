/* Write a method called processName that accepts a Scanner for the console as a parameter and prompts the user to enter a full name,
then prints the full name in uppercase characters. Here is an example dialogue with the user.

Please enter your full name: Humpty Dumpty
THe name in uppercase characters is: HUMPTY DUMPTY */

import java.util.*;

public class ThreePointTwentyOne
{
   public static void main(String[] args)
   {
      processName();
   }
   
   public static void processName()
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Please enter your full name: ");
      String name = console.nextLine();
      System.out.println("The name in uppercase characters is: " + name.toUpperCase());
   }
}