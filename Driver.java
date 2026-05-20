package AdvanceMultithreading;

public class Driver {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable t1 = ()-> account.withdraw("Wife",500);
        Runnable t2 = ()-> account.withdraw("Husband",200);
        Runnable t3 = ()-> account.withdraw("Mother",600);

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }
}
