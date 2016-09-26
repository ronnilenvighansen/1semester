/* Add the following accessor method to the Point class:

public boolean isCollinear(Point p1, Point p2)

Returns whether this Point is collinear with the given two other Points. Points are collinear if a straight line can be drawn that
connects them. Two basic examples are three points that have the same x- or y-coordinate. The more general case can be determined by
calculating the slope of the line between each pair of points and checking whether this slope is the same for all pairs of points-
Use the formula (y2 - y1)/(x2 - x1) to determine the slope between two points (x1, y1) and (x2, y2). (Note that this formula fails for
points with identical x.coordinates so this will have to be a special case in your code.) Since Java's double type is imprecise, round all
slope values to a reasonable accuracy such as four digits past the decimal point before you compare them. */

public class EightPointSix
{
   public static void main(String[] args)
   {
      Point p = new Point(1, 2);
      Point q = new Point(2, 4);
      Point r = new Point(3, 6);
      System.out.println(p.isCollinear(q, r));
   }
}