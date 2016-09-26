/* Suppose the following BankAccount class has been created:

public class BankAccount
{  
   String name;
   double balance;
   
   public void deposit(BankAccount other, double money)
   {
      this.balance += money;
   }
   
   public void withdraw(double amount)
   {
      balance = balance - money;
   }
} 

Add a field to the BankAccount class named trnsactionFee for a real number representing an amount of money to deduct every time the user withdraws money.
The default value is $0.00, but the client can change the value. Deduct the transaction fee money during every withdraw call (but not from deposits).
Make sure that the balance cannot go negative during a withdrawal. If the withdrawal (amount plus transaction fee) would cause it to become negative, don't
modify the balance at all. */

public class EightPointEleven
{
   public static void main(String[] args)
   {
      BankAccount ben = new BankAccount("ben", 0.0, 5.0);
      ben.deposit(20.0);
      ben.withdraw(10.0);
      System.out.println(ben.toString());
   }
}