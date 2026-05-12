package Oops;

// This Is Encapsulation and Abstraction eg

public class ATM {

    String AccountHolderName;

    private double balance;

    ATM(String name,double balance)
    {
        this.AccountHolderName = name;
        this.balance = balance;
    }

    public static void main(String[] args) {

        ATM atm = new ATM("Alice",10000.00);
        atm.ShowBal();
    }

    public  void ShowBal()
    {
        System.out.println("The balance is : "+balance);
    }
}
