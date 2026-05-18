package Multithreading;

class even extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<10;i+=2)
        {
            System.out.println("Even : "+i);
        }
    }
}

class odd extends Thread{
    @Override
    public void run() {
        for(int i = 1; i<10;i+=2)
        {
            System.out.println("Odd : "+i);
        }
    }
}

public class EvenOddThread {
    public static void main(String[] args) {
        even e = new even();
        e.start();
        odd o = new odd();
        o.start();
    }
}
