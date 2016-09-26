/* Add the following mutator method to the point class:

Public void flip()

Negates and swaps the x/y coordinates of the Point object. For example, if an object pt initially represents the point(5, -3), after a
call of pt.flip(); the object should represent(3, -5). If the same object initially represents the point(4, 17), after a call to
pt.flip(); the object should represent(-17, -4). */ 

public class EightPointTwo
{
   public static void main(String[] args)
   {
      Point p = new Point(3, 8);
      p.flip();
      System.out.println(p.toString());
   }
}