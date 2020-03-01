/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

/**
 *
 * @author AIC
 */
public class PersonalSaving extends PersonalAccount {
    public final double monthlyfee = 20; //monthly fee
    private int numofwithdraws = 0; // total number of withdraws of the current month
    private final double withdrawfee = 5; //withdraw fee
    //constructor
    public PersonalSaving(String name, String address, String email, String phone)
    {
        super(name, address, email, phone); //call parent's constructor
        setinterestrate(0.03); //set interest rate to 0
    }
       
    @Override 
    public boolean withdraw(double amount)
    {
        boolean result;
        numofwithdraws++;
        if(numofwithdraws<=5)
            result = super.withdraw(amount);
        else
            result = super.withdraw(amount+withdrawfee);
        return result;
    }
    
    @Override
    public void addfee()
    {
        if (balance <= 3000)
            balance -= monthlyfee;
        numofwithdraws = 0;
    }
}
