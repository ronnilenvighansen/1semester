/* Write a class called Line that represents a line segment between two Points. Your Line objects should have the
following methods:
public Line(Point p1, Point p2)
Constructs a new Line that contains the given two Points.
public Point getP1()
Returns this Line’s first endpoint.
public Point getP2()
Returns this Line’s second endpoint.
public String toString()
Returns a String representation of this Line, such as "[(22, 3), (4, 7)]". */

public class EightPointFourteen
{
   public static void main(String[] args)
   {
      Point p1 = new Point(1, 1);
      Point p2 = new Point(2, 2);
      Line l = new Line(p1, p2);
      System.out.println(l.getP1());
      System.out.println(l.getP2());
      System.out.println(l.toString1());
   }
}