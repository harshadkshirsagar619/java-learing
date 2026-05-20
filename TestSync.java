package Multithreading;

class TablePrintWithMethod
{
    synchronized public void table(int n)
    {
        for(int i = 1; i <= 5 ; i++)
        {
            System.out.println(Thread.currentThread().getName() +" : " +n * i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadC extends Thread
{
    TablePrintWithMethod t;
    ThreadC(TablePrintWithMethod t)
    {
        this.t=t;
    }

    @Override
    public void run() {
        t.table(5);
    }
}

public class TestSync {
    public static void main(String[] args) {
        TablePrintWithMethod t = new TablePrintWithMethod();
        ThreadC c = new ThreadC(t);
        ThreadC c2 = new ThreadC(t);

        c.setName("Thread T1");
        c2.setName("Thread T2");

        c.start();
        c2.start();

        try{
            System.out.println("Main Thread Waiting");
            c.join();
            c2.join();
            System.out.println("Main Thread Waiting");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
