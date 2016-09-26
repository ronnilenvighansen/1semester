/* Add the following mutator method to the TimeSpan class:
   
public void scale(int factor)
   
Scales this time span by the given factor. For example, 1 hour and 45 minutes scaled by 2 equals 3 hours and 30 minutes. */

public class EightPointNine
{
   public static void main(String[] args)
   {
      TimeSpan time = new TimeSpan(1, 45);
      time.scale(2);
      System.out.print(time.toString());
   }
}