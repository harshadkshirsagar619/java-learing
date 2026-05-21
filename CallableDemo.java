package AdvanceMultithreading;

import java.util.Random;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(4);

        Task t = new Task();
        Future<Integer> future = service.submit(t);

        // perform some unrelated operations

        try {
            Integer result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Thread Name : "+Thread.currentThread().getName());
    }
}
class Task implements Callable<Integer>
{
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return new Random().nextInt();
    }
}
