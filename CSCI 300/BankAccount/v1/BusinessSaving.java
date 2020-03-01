/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

/**
 *
 * @author AIC
 */
public class BusinessSaving extends BusinessAccount {
    
    public final double withdrawfee = 10; //withdraw fee
    //constructor
    public BusinessSaving(String name, String address, String email, String phone)
    {
        super(name, address, email, phone); //call parent's constructor
        setinterestrate(0.025); //set interest rate to 0
    }
   

    @Override
    public boolean withdraw(double amount)
    {
        if (amount > 0 && balance >= amount + withdrawfee)
            balance = balance - amount - withdrawfee;
        else 
            return false;
        return true;
    }
}