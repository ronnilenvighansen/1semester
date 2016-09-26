public class Line
{
   private Point p1;
   private Point p2;
   int x1;
   int y1;
   int x2;
   int y2;
   
   
   public Line(Point p1, Point p2)
   {
      this.p1 = p1;
      this.p2 = p2;
   }
   
   public Line(int x1, int y1, int x2, int y2)
   {
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
   }
   
   public Point getP1()
   {
      return p1;
   }
   
   public Point getP2()
   {
      return p2;
   }
   
   public boolean isCollinear(Point p)
   {
      return(((this.y2 - this.y1) / (this.x2 - this.x1)) == ((p.y - this.y2) / (p.x - this.x2)));
   }
   
   public String toString1()
   {
      return("[" + p1 + ", " + p2 + "]");
   }
   
   public String toString2()
   {
      return("[(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")]"); 
   }
}