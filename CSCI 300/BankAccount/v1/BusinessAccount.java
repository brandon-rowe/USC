/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

/**
 *
 * @author AIC
 */
public abstract class BusinessAccount extends BankAccount{
    public final double monthlyfee = 20; //monthly fee
    //constructor
    public BusinessAccount(String name, String address, String email, String phone)
    {
        super(name, address, email, phone); //call parent's constructor
    }
    
    @Override
    public void addfee()
    {
        balance -= monthlyfee;
    }
}
