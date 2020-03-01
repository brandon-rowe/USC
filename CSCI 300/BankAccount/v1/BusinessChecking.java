/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

/**
 *
 * @author AIC
 */
public class BusinessChecking extends BusinessAccount {
    
    public final double withdrawfee = 10; //withdraw fee
    //constructor
    public BusinessChecking(String name, String address, String email, String phone)
    {
        super(name, address, email, phone); //call parent's constructor
        setinterestrate(0); //set interest rate to 0
    }
   
    @Override
    public boolean withdraw(double amount)
    {
        if (amount > 0)
        {
            if(amount > 10000 && balance >= amount + withdrawfee)
                balance = balance - amount - withdrawfee;
            else if (amount <= 10000 && balance >= amount)
                balance = balance - amount;
            else 
                return false;
        }
        else
            return false;
        return true;
    }
}
