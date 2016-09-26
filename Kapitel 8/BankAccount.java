/* Add a transfer method to the BankAccount class from the previous excercises. Your method should move money from the current bank account
to another account. The method accepts two parameters: a second Bankaccount to accept the money, and a real number for the amount of money
to transfer. There is a $5.00 fee for transferring money, so this must be deducted from the current account's balance before any transfer.
The method should modify the two BankAccount objects such that "this" current object has its balance decreased by the given amount plus the
$5 fee, and the other account's balance is increased by the given amount. If this account object does not have enough money to make the full
transfer, transfer whatever money is left after th $5 fee is deducted. If this account has under $5 or the amount is 0 or less, no tranfer
should occur and neither account's state should be modified. The following are some example calls to the method:
BankAccount ben = new BankAccount();
ben.deposit(80.00);
BankAccount hal = new Bankaccount();
ben.transfer(hal, 20.00); // ben $60, hal $40 (ben -$20, hal +$20)
ben.transfer(hal, 10.00); // ben $50, hal $50 (ben -$10, hal +$10)
hal.transfer(ben, 60.00); // ben $100, hal $0 (ben +$50, hal -$50) */

public class BankAccount
{  
   String name;
   double balance;
   double transactionFee;
   
   public BankAccount(String name, double balance)
   {
      this.name = name;
      this.balance = balance;
   }
   
   public BankAccount(String name, double balance, double transactionFee)
   {
      this.name = name;
      this.balance = balance;
      this.transactionFee = transactionFee;
   }
   
   public void deposit(double money)
   {
      this.balance += money;
   }
   
   public void withdraw(double money)
   {
      if(balance >= transactionFee)
      {
         this.balance -= (money + transactionFee);
      }
      
      else
      {
         throw new IllegalArgumentException();
      }
   }
   
   public void transfer(BankAccount other, double money)
   {
      if(balance >= transactionFee)
      {
         this.balance -= (money + transactionFee);
         other.balance += money;
      }
      
      else
      {
         throw new IllegalArgumentException();
      }
   }
   
   public String toString()
   {
      return ("Name = " + name + ", " + "Balance = $" + balance);
   }
}