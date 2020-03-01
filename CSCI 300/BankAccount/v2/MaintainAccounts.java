package inherit;


public class MaintainAccounts {
    private int numofaccounts=0; //used to track the number of accounts;
    private int numofdelaccounts = 0; //used to track the number of deleted accounts;
    private BankAccount[] acclist;//used to store accounts
    private BankAccount[] delacclist; //used to store deleted accounts
    //constructor
    public MaintainAccounts()
    {
        acclist = new BankAccount[2];
        delacclist = new BankAccount[2];
    }
    
    public void newaccount(BankAccount acc)
    {
        if (numofaccounts == acclist.length)
            acclist = increase(acclist);
        acclist[numofaccounts++] = acc;
    }
    
    //increase the size of acclist
    private BankAccount[] increase(BankAccount[] list)
    {
        BankAccount[] newlist = new BankAccount[list.length*2];
        //copy accounts
        for(int i=0;i<list.length;i++)
            newlist[i] = list[i];
        return newlist;
    }
    
    //deduct fee from every account
    public void applyfee()
    {
        for(int i=0;i<numofaccounts;i++)
            acclist[i].addfee();
    }
    
    //deduct fee from every account
    public void addinterest()
    {
        for(int i=0;i<numofaccounts;i++)
            acclist[i].addinterest();
    }
    
    public BankAccount findaccount(int accnum)
    {
        BankAccount result = null;
        for(int i=0;i<numofaccounts;i++)
            if (acclist[i].getaccountnumber() == accnum)
            {
                result = acclist[i];
                break;
            }
        return result;
    }
    
    public boolean closeaccount(int accnum)
    {
        //find the account
        int index = -1;
        for(int i=0;i<numofaccounts;i++)
            if (acclist[i].getaccountnumber() == accnum)
            {
                index = i;
                break;
            }
        if (index == -1)
            return false; //cannot find the account
        //delete it
        if (numofdelaccounts == delacclist.length)
            delacclist = increase(delacclist);
        delacclist[numofdelaccounts++] = acclist[index];
        //delete it from acclist
        deleteaccount(index);
        return true;
    }
    
    //delete the account at index
    private void deleteaccount(int index)
    {
        for (int i = index+1;i<numofaccounts;i++)
            acclist[i-1] = acclist[i];
        numofaccounts--;
    }
    
    @Override
    public String toString()
    {
        String result="";
        for(int i=0;i<numofaccounts;i++)
            result += acclist[i];
        return result;
    }
}
