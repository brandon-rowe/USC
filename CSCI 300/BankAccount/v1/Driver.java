
package inherit;

/**
 *
 * @author AIC
 */
public class Driver 
{
    public static void main(String[] arg)
    {
         // Create instance of MaintainAccounts() called test.
         MaintainAccounts test = new MaintainAccounts();
         // Create instance of BankAccount called acc.
         // acc is used to call BusinessChecking, BusinessSaving, PersonalChecking, PersonalSaving methods
         BankAccount acc = new BusinessChecking("BC","Hello St.","a@abc.edu","555-555-55555");
         test.newaccount(acc);   // calling MaintainAccounts(newaccount()) with "test"
         acc.deposit(5000);      // calling BankAccount(depost()) with "acc"  
        
         acc = new BusinessSaving("BS","Hello St.","a@abc.edu","555-555-55555");
         test.newaccount(acc);
         acc.deposit(4000);
        
         acc = new PersonalChecking("PC","Hello St.","a@abc.edu","555-555-55555");
         test.newaccount(acc);
         acc.deposit(3000);
        
         acc = new PersonalSaving("PS","Hello St.","a@abc.edu","555-555-55555");
         test.newaccount(acc);
         acc.deposit(2000);
        
         acc = new BusinessChecking("A","Hello St.","a@abc.edu","555-555-55555");
         test.newaccount(acc);
         acc.deposit(1000);
         System.out.println(test);
        
         test.applyfee();
         test.addinterest();
         System.out.println(test);  
    }
}
