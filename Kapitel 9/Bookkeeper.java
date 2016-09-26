public class Bookkeeper extends Employee
{
   public int getSalary()
   {
      return (super.getSalary() - 15000);
   }
   
   public String calculate()
   {
      return ("no margin for errors!");
   }
}