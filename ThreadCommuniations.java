package Multithreading;

public class ThreadCommuniations {
    public static void main(String[] args) throws InterruptedException{

        Thread1 a1 = new Thread1();
        Thread1 a2 = new Thread1();

        a1.start();
        synchronized (a1)
        {
            System.out.println("Main Thread call wait()..");
            a1.wait();
            System.out.println("Main Thread get Notify...");
            System.out.println("Toatl : "+a1.total);
        }
    }
}

class Thread1 extends Thread
{
    int total = 0;
    @Override
    public void run() {
        synchronized (this)
        {
            System.out.println("Child Thread start Cal......");
            for (int i = 0;i<=100;i++)
            {
                total = total + i;
            }
            this.notify();
            System.out.println("Child Thread Completed");
        }
    }
}
