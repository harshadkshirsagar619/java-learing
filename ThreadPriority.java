package Multithreading;

class MyThread2 extends Thread
{
    @Override
    public void run() {
        for (int i = 0;i<5;i++)
        {
            System.out.print(Thread.currentThread().getName());
            System.out.println(" "+Thread.currentThread().getPriority());
        }
    }
}

public class ThreadPriority {

    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.setName("Thread T");
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();

        MyThread2 t2 = new MyThread2();
        t2.setName("Thread T2");
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
    }
}
