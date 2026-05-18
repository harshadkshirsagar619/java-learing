package Multithreading;

class JoinThread extends Thread
{
    @Override
    public void run() {
        System.out.println();

        for(int i = 0; i < 5;i++)
        {
            System.out.println("Child Thread : "+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class JoinNewThread extends Thread
{
    @Override
    public void run() {
        for(int i = 0; i < 5;i++)
        {
            System.out.println("Child Thread - 2 - : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException{

        JoinThread j = new JoinThread();
        j.start();

         j.join(1000,10);  // <--- main
        for(int i = 1;i <= 5;i++)
        {
            System.out.println("Main Thread");
        }

        JoinNewThread j2 = new JoinNewThread();
        j2.start();
    }
}
