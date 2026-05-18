package Multithreading;

class MyNewThread extends Thread
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class SetThreadName {
    public static void main(String[] args) {
        System.out.println("main Thread");
        MyNewThread t = new MyNewThread();
        t.setName("Alice");
        t.start();
    }
}
