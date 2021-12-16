// WAP to create an abstract class account having 4 instance.

// Account Balance
// Account Holder Name
// Account Number
// Address

// This abstract class account contains 1 abstract method deposited balance and concrete method account_balance.

// Create a subclass saving that extend the account that will display the deposited amount, rate_of_interest, new_balance & account_details.

abstract class Account {
    int ab;
    String hn;
    int an;
    String add;

    abstract void deposit_balance();

    void account_details()
    {
        System.out.println("Account Balance: " + ab);
        System.out.println("Account Holder Name: " + hn);
        System.out.println("Account Number: " + an);
        System.out.println("Address: " + add);
    }
}

class Savings extends Account {
    int da;
    double roi;
    int nb;

    void deposit_balance()
    {
        System.out.println("Deposited Amount: " + da);
        System.out.println("Rate of Interest: " + roi);
        System.out.println("New Balance: " + nb);
    }
}


public class _23_Abstract_Account {
    public static void main(String args[]) {
        Savings s =new Savings();

        s.ab = 10000;
        s.hn = "Aditya";
        s.an = 300539;
        s.add = "DURGAPUR";
        s.account_details();

        s.da = 5000;
        s.roi = 65;
        s.nb = s.ab + s.da;
        s.deposit_balance();
    }    
}


// OUTPUT

// Account Balance: 10000
// Account Holder Name: Aditya
// Account Number: 300539     
// Address: DURGAPUR
// Deposited Amount: 5000     
// Rate of Interest: 65.0     
// New Balance: 15000