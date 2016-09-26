/* Write a method called rectPerimeter that accepts a length and breadth of a rectangle as parameters and returns the perimeter
of a rectangle. For example, the call rectPerimeter(3, 4) should return 14. The formula for perimeter of a rectangle with length l
and breadth b is the following:

perimeter = 2 X (l + b) */

public class ThreePointFourteen
{
   public static void main(String[] args)
   {
      System.out.println(rectPerimeter(3, 4));
   }
   
   public static int rectPerimeter(int length, int breadth)
   {
      int perimeter = 2 * (length + breadth);
      return perimeter;
   }
}