public class Guard extends Employee
{
   public int getHours()
   {
      return (super.getHours() * 2);
   }
   
   public int getSalary()
   {
      return (super.getSalary() - 20000);
   }
   
   public int getVacationDays()
   {
      return (super.getVacationDays() - 3);
   }
   
   public String identity()
   {
      return ("Verify the Guest's identity!");
   }
}