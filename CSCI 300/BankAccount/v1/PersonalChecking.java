/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

/**
 *
 * @author AIC
 */
public class PersonalChecking extends PersonalAccount {
    public final double monthlyfee = 10; //monthly fee
    private double totaldeposit = 0; // total deposit of the current month
    //constructor
    public PersonalChecking(String name, String address, String email, String phone)
    {
        super(name, address, email, phone); //call parent's constructor
        setinterestrate(0); //set interest rate to 0
    }
    
    @Override
    public boolean deposit(double amount)
    {
        boolean result;
        if(result = super.deposit(amount))
            totaldeposit += amount;  //accumulate the current total deposit amount
        return result;
    }
    
    @Override
    public void addfee()
    {
        if (totaldeposit <= 500)
            balance -= monthlyfee;
        totaldeposit = 0; //after add fee, reset total deposit amount
    }
}
