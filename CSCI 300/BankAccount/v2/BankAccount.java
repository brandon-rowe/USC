package inherit;


public abstract class BankAccount {
    //member variables to describe an account
    private String name;
    private int accountnumber;
    private String address;
    private String email;
    private String phone;
    protected double balance;
    private static int currentaccnum = 10000; //used to generate accountnumber for a new account
    private double interestrate; //interest rate 
    
    //constructor
    public BankAccount(String name, String address, String email, String phone)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        balance = 0; //inital balance 0
        interestrate = 0; //inital rate is 0;
        accountnumber = currentaccnum++; 
        //curentaccnum always holds a number can be used as an account number for a new created accoun
    }
    
    //deposit, return true if done sucessfully; otherwise return false
    public boolean deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
            return true;
        }
        return false;
    }
    
    //abstract method for withdraw
    public abstract boolean withdraw(double amount); 
    
    //abstract method for adding fee
    public abstract void addfee();
    
    
    //set interest rate
    protected void setinterestrate(double rate)
    {
        interestrate = rate;
    }
    
    //method to add interest.
    public void addinterest()
    {
        balance = balance * (1+interestrate);
    }
    
    //return balance
    public double getbalance()
    {return balance;}
    
    //return accountnumber
    public int getaccountnumber()
    {return accountnumber;}
    
    @Override
    public String toString()
    {
      return "Account name: " + name + "\n Account number: " + accountnumber + "\n Account balance: " + balance + "\n";
    }
}
