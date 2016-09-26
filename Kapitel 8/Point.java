public class Point
{
   int x;
   int y;
   
   public Point(int initialX, int initialY)
   {
      x = initialX;
      y = initialY;
   }
   
   public void flip()
   {
      int temp;
      temp = x;
      x = y;
      y = temp;
      x *= -1;
      y *= -1;
   }
   
   public boolean isHorizontal(Point other)
   {
      if(this.y == other.y)
      {
         return true;
      }
      
      else
      {
         return false;
      }
   }
   
   public double slope(Point other)
   {
      return (double)((other.y - this.y) / (other.x - this.x));
   }
    
    
   public boolean isCollinear(Point p1, Point p2)
   {
      if(((p1.y - this.y) / (p1.x - this.x)) == ((p2.y - p1.y) / (p2.x - p1.x)))
      {
         return true;
      }
      
      else
      {
         return false;
      }
   }
   
   public String toString()
   {
      return ("(" + x + ", " + y + ")");
   }
}