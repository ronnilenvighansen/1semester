/* Add the following accessor method to the point class:

public boolean isHorizontal(Point other)

returns true if the given Point lines up horizontally with this point, that is, if their y-coordinates are the same. */

public class EightPointFour
{
   public static void main(String[] args)
   {
      Point p = new Point(3, -5);
      Point q = new Point(3, -5);
      System.out.println(p.isHorizontal(q));
   }
}