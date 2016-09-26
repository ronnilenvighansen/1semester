public class Employee
{
   private int salary;
   private int hours;
   private int vacationsDays;
   
   public Employee()
   {
      this.salary = getSalary();
      this.hours = getHours();
      this.vacationsDays = getVacationDays();
   }
   
   public int getSalary()
   {
      return 40000;
   }
   
   public int getHours()
   {
      return 40;
   }
   
   public int getVacationDays()
   {
      return 10;
   }
}