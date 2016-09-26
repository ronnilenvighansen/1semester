/* Write a class called Rectangle that represents a rectangular two-dimensional region. Your Rectangle objects
should have the following methods:
public Rectangle(int x, int y, int width, int height)
Constructs a new Rectangle whose top-left corner is specified by the given coordinates and with the given width
and height. Throw an IllegalArgumentException on a negative width or height.
public int getHeight()
Returns this Rectangle’s height.
public int getWidth()
Returns this Rectangle’s width.
public int getX()
Returns this Rectangle’s x-coordinate.
public int getY() 
Returns this Rectangle’s y-coordinate.
public String toString()
Returns a String representation of this Rectangle, such as "Rectangle[x=1,y=2,width=3,
height=4]".*/

public class EightPointEighteen
{
   public static void main(String[] args)
   {
      Rectangle r = new Rectangle(1, 1, 1, 1);
      System.out.print(r.toString());
   }
}