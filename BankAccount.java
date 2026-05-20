package AdvanceMultithreading;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int bal = 1000;

    private  final ReentrantLock rl = new ReentrantLock();


    // In 1.5 synchronization

    public void withdraw(String threadName,int amount)
    {

        System.out.println(threadName + " is Trying to Withdraw : " +amount);
        rl.lock();
        try{
            System.out.println(threadName + " Acquired Lock");
            if(bal >= amount)
            {
                Thread.sleep(1000);
                bal = bal-amount;
                System.out.println("Widthdraw Amount : "+amount + " Remaining Bal : " +bal);
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }finally {
            rl.unlock();
        }
    }
}
