package AdvanceMultithreading;


//ExecutorService

public class CertificationSender implements Runnable{

   // CertificationSender st

    private final String stdName;

    public CertificationSender(String stdName)
    {
        this.stdName = stdName;
    }

    @Override
    public void run() {
        System.out.println("Sending certificate to "+ stdName + " by thread "+Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Certficate send to "+stdName + " by thread : "+Thread.currentThread().getName());
    }
}
