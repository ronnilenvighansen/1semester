/* Write a method called salary that accepts two parameters: one integer for an employee's fixed salary, and another integer for the gross sales
in that month by the employee. The method should return how much salary to pay to the employee. For example, the call salary(5000, 10000)
should return 5500. The employee should receive fixed salary plus 5% of the gross sales as the total salary. For example,
the call salary(1000, 5000) should return (1000) + (0.05 * 5000) or 1250. */

public class ThreePointThirteen
{
   public static void main(String[] args)
   {
      salary(5000, 10000);
      salary(1000, 5000);
   }
   
   public static void salary(int fixedSalary, int grossSales)
   {
      double extraSalaryPercentage = 0.05;
      int extraSalary = (int)(grossSales * extraSalaryPercentage);
      int totalSalary = fixedSalary + extraSalary;
      System.out.println(totalSalary);
   }
}