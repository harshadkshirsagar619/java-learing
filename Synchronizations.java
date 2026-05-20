package Multithreading;


class add
{

    synchronized public static void Addition()
    {
        int sum = 0;
        for (int i = 0; i<=10;i++)
        {
            sum = sum + i;
            System.out.println("The sum is : "+sum);
        }

    }
}
class ThreadA extends  Thread
{
    add a;
    ThreadA(add a)
    {
        this.a=a;
    }

    @Override
    public void run() {
        add.Addition();
    }
}

class ThreadB extends  Thread
{
    add a;
    ThreadB(add a)
    {
        this.a=a;
    }

    @Override
    public void run() {
        add.Addition();
    }
}

public class Synchronizations {
    public static void main(String[] args) {
        add A= new add();
        ThreadA t1 = new ThreadA(A);
        ThreadB t2 = new ThreadB(A);

        t1.start();
        t2.start();
    }
}
