/* Add the following accessor methods to your Rectangle class:
public boolean contains(int x, int y)
public boolean contains(Point p)
Returns whether the given Point or coordinates lie inside the bounds of this Rectangle. */

public class EightPointTwenty
{
   public static void main(String[] args)
   {
      Point p = new Point(1, 1);
      Rectangle r = new Rectangle(1, 1, 1, 1);
      System.out.println(r.contains(1, 1));
      System.out.println(r.contains(p));
   }
}