/* Add a toString method to the BankAccount class from the previous exercise. Your method should return a string that
contains the account's name and balance separated by a comma and space. For example, if an account object named yana
has the name "Yana" and a balance of 3.03, the call yana.toString() should return the string "Yana, $3.03". */

public class EightPointTwelve
{
   public static void main(String[] args)
   {
      BankAccount yana = new BankAccount("yana", 3.03);
      yana.toString();
   }
}