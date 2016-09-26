/* Write the class Bookkeeper to accompany the other law firm class described in this chapter. Bookkeepers make
$25,000 ($15,000 less than general employees) and have an additional method called calculate that prints "no
margin for errors!" Make sure to interact with the superclass as appropriate. */

public class NinePointOne
{
   public static void main(String[] args)
   {
      Employee matt = new Employee();
      Employee jack = new Bookkeeper();
      Bookkeeper stan = new Bookkeeper();
      System.out.println(matt.getSalary());
      System.out.println(jack.getSalary());
      System.out.println(stan.getSalary());
      System.out.println(stan.calculate());
   }
}