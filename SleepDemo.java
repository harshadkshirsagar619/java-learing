package Multithreading;

class SleepThread extends  Thread
{
    @Override
    public void run() {
        System.out.println();
        for(int i = 0 ;i <= 5 ; i++)
        {
            System.out.println(getName() +" : " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }

        }
    }
}

public class SleepDemo {
    public static void main(String[] args) {

        SleepThread s = new SleepThread();
        s.setName("Child");
        s.start();
    }
}
