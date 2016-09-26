/* Add the following mutator method to the Stock class:

public void clear()

Resets Stock's number of shares purchased and total cost to 0. */

public class EightPointTen
{
   public static void main(String[] args)
   {
      Stock s = new Stock(10, 10);
      s.clear();
      System.out.print(s.toString());
   }
}