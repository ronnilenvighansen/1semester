/* Write a method called squareArea that accepts the side of a square as a parameter and returns the area of a square. For example, the call
squareArea(3) should return 9. The formula for area of a square with side s is the following: 

area = s^2 */

public class ThreePointFifteen
{
   public static void main(String[] args)
   {
      System.out.println(squareArea(3));
   }
   
   public static int squareArea(int sideOfSquare)
   {
      int area = sideOfSquare * sideOfSquare;
      return area;
   }
}