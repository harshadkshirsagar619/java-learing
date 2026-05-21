package AdvanceMultithreading;

import java.util.concurrent.*;

public class CallableAndFutureDemo {
    public static void main(String[] args) throws ExecutionException,InterruptedException {

        ExecutorService service = Executors.newCachedThreadPool();

        Callable<String> callable =()->{
            Thread.sleep(5000);
            return "Thread Returns From : "+Thread.currentThread().getName();
        };

        System.out.println("Submitting Callable");
        Future<String> future = service.submit(callable);

        System.out.println("Procing something else ehile callable is getting executed in parallel");

        System.out.println("Accessing future object to get Result");
        String result = future.get();
        System.out.println("Returned result from callable : "+result);

        service.shutdown();

    }
}
