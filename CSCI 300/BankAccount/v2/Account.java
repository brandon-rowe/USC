import java.util.Random;

public class Account 
{
    Random generator = new Random();
    private double balance;
    private String name;
    private long acctNum;
    private static int numAccounts;
 
    // Constructor --  initializes balance, owner, and account number

    public Account(double initBal, String owner, long number) 
    {
        balance = initBal;
        name = owner;
        acctNum = number;
        numAccounts++;
    } 

    public Account(double initBal, String owner) 
    {
        balance = initBal;
        name = owner;
        acctNum = generator.nextLong();
        numAccounts++;
    }

    public Account(String owner) 
    {
        name = owner;
        balance = 0;
        acctNum = generator.nextLong();
        numAccounts++;
    }
     /**
     * Checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.
     */

    public void withdraw(double amount, int fee) 
    {
        if (balance >= amount)
            balance -= amount - fee;
        else
            System.out.println("Insufficient funds");
    }

    public final void deposit(double amount) 
    {
        balance += amount;
    }
   //Returns balance.

    public final double getBalance() 
    {
        return balance;
    }

    public final String toString() 
    {
        return "Name:" + name + "\nAccount Number: " + acctNum  + "\nBalance: " + balance;
    }

   public static int getnumAccounts() 
   {
        return numAccounts;
   }

    public void close() 
    {
       name += "Closed";
       balance = 0;
       numAccounts--;
    }
   
    public static Account consolidate(Account acct1, Account acct2)
    {
        if (acct1.acctNum == acct2.acctNum) 
        {
            System.out.println("Same account number cannot be consolidated");
        } 
        else if ((acct1.name).equalsIgnoreCase(acct2.name)) 
        {
               Account acctConsolidate = new Account
               (acct1.getBalance() + acct2.getBalance(),acct1.name);
                acct1.close();
                acct2.close();
                return acctConsolidate;
        } 
        else 
        {
                System.out.println("The two accounts does not belong to " + "the same person");
                return null;
        }
        return Account.consolidate(acct1, acct2);
    }
}