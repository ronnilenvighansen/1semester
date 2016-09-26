/* Write a method called colorsInRainbow that takes a color number (an integer between 1 and 7) as a parameter and returns the color
corresponding to that color number. For example, the caall colorsInRainbow(3) would return "Blue" because the third color i rainbow is Blue.
Assume that the user always inputs a number between 1 and 7, inclusive of both. The following table lists the colors in a rainbow
and their corresponding numbers:

Number(Color): 1(Violet), 2(Indigo), 3(Blue), 4(Green), 5(Yellow), 6(Orange), 7(Red). */

public class FourPointFour
{
   public static void main(String[] args)
   {
      colorsInRainbow(1);
      colorsInRainbow(2);
      colorsInRainbow(3);
      colorsInRainbow(4);
      colorsInRainbow(5);
      colorsInRainbow(6);
      colorsInRainbow(7);
      colorsInRainbow(8);
   }
   
   public static void colorsInRainbow(int color)
   {
      if(color == 1)
      {
         System.out.println("Violet");
      }
      else if(color == 2)
      {
         System.out.println("Indigo");
      }
      else if(color == 3)
      {
         System.out.println("Blue");
      }
      else if(color == 4)
      {
         System.out.println("Green");
      }
      else if(color == 5)
      {
         System.out.println("Yellow");
      }
      else if(color == 6)
      {
         System.out.println("Orange");
      }
      else if(color == 7)
      {
         System.out.println("Red");
      }
      else
      {
         System.out.println("The number does not represent a color in a rainbow.");
      }
   }
}