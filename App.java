package AdvanceMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//ExecutorService

public class App {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(8);

        String[] studentlist = {
                "Ram","Raj","Ashu","Aman","Sachine","Sunny","Sanket","Raju","Adharsh","Rohit","Aaru","Shashank","Sagar","Anju"
        };

        for (String student : studentlist)
        {
            CertificationSender task = new CertificationSender(student);
            service.submit(task);
        }

        service.shutdown();
    }
}
