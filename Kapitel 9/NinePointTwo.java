/* Write a class Guard to accompany the other law firm classes described in this chapter. Guard works twice as many
hours per week as other employees (80 hours/week), they make $20,000 ($20,000 less than general employees), they
get 3 days less vacation than other employees (only 7 days), and they have an additional method identity that
prints "Verify the Guest's identity!" Make sure to interact with the superclass as appropriate. */

public class NinePointTwo
{
   public static void main(String[] args)
   {
      Guard greg = new Guard();
      System.out.println(greg.getHours());
      System.out.println(greg.getSalary());
      System.out.println(greg.getVacationDays());
      System.out.println(greg.identity());
   }
}