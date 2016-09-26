/* Add the following accessor method to the Point class:

public double slope(Point other)

Returns the slope of the line drawn between this Point and the given other Point. Use the formula (y2 - y1) / (x2 - x1) to determine the
slope between two points (x1, y1) and (x2, y2). Note that this formula fails for points with identical x-coordinates, so throw an
IllegalArgumentException in this case. */

public class EightPointFive
{
   public static void main(String[] args)
   {
      Point p = new Point(10, 5);
      Point q = new Point(5, 10);
      System.out.println(p.slope(q));
   }
}