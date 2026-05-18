package Multithreading;

class MyRunThread extends Thread{
    @Override
    public void run() {
        super.run();
    }
}

public class RunOverride {
    public static void main(String[] args) {
        MyRunThread t = new MyRunThread();
        t.start();
        for (int i = 0;i<5; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
