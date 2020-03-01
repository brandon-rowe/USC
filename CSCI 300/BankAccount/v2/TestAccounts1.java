import java.util.Scanner;

public class TestAccounts1 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is the name for account 1: ");
        String name  = scan.nextLine();
        Account acct1 = new Account(100, name);
        System.out.println(acct1);
        System.out.println("Now there are " + Account.getnumAccounts()
                               + " accounts");
        //Second account
        System.out.println("");
        System.out.println("What is the name for account 2: ");
        name = scan.nextLine();
        Account acct2 = new Account(100, name);
          System.out.println(acct2);
        System.out.println("Now there are " + Account.getnumAccounts()
                               + " accounts");
        //Third account
        System.out.println("");
        System.out.println("What is the name for account 3: ");
        name = scan.nextLine();
        Account acct3 = new Account(100,name);
        System.out.println(acct3);
        System.out.println("Now there are " + Account.getnumAccounts()
                               + " accounts");
         acct1.close();
        // Consolidate Account
        System.out.println("");
        System.out.println("Account consolidated");
        System.out.println(Account.consolidate(acct2, acct3));
        System.out.println("Now there are " + Account.getnumAccounts()
                               + " accounts");
    }}
