public class Rectangle
{
   private int x;
   private int y;
   private int height;
   private int width;
   
   public Rectangle(int x, int y, int height, int width)
   {
      if(height >= 0 && width >= 0)
      {
         this.x = x;
         this.y = y;
         this.height = height;
         this.width = width;
      }
      
      else
      {
         throw new IllegalArgumentException();
      }
   }
   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   public int getHeight()
   {
      return height;
   }
   
   public int getWidth()
   {
      return width;
   }
   
   public boolean contains(int x, int y)
   {
      if(x < 0 || y < 0)
      {
         return false;
      }
      
      else
      {
         return (x <= width && x <= height && y <= width && y <= height);
      }
   }
   
   public boolean contains(Point p)
   {
      if(p.x < 0 || p.y < 0)
      {
         return false;
      }
      
      else
      {
         return (p.x <= width && p.x <= height && p.y <= width && p.y <= height);
      }
   }
   
   public String toString()
   {
      return("Rectangle[x=" + getX() + ",y=" + getY() + ",Height=" + getHeight() + ",Width=" + getWidth() + "]");
   }
}