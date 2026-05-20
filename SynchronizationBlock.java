package Multithreading;


class add1
{

    public void Addition()
    {
        synchronized (this)
        {
            int sum = 0;
            for (int i = 0; i <= 10; i++)
            {
                sum = sum + i;
                System.out.println("The sum is : " + sum);
            }
        }

    }
}
class ThreadA1 extends  Thread
{
    add1 a;
    ThreadA1(add1 a)
    {
        this.a=a;
    }

    @Override
    public void run() {
        a.Addition();
    }
}

class ThreadB1 extends  Thread
{
    add1 a;
    ThreadB1(add1 a)
    {
        this.a=a;
    }

    @Override
    public void run() {
        a.Addition();
    }
}


public class SynchronizationBlock {
    public static void main(String[] args) {

        add1 A= new add1();
        ThreadA1 t1 = new ThreadA1(A);
        ThreadB1 t2 = new ThreadB1(A);

        t1.start();
        t2.start();
    }
}
