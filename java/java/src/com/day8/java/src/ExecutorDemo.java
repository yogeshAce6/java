import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = newFixedThreadPool(5);
        Runnable r1 =()-> {
            System.out.println("Thread is Running:"+Thread.currentThread().getName());
        };
                for(int i=0;i<5;i++){
                    executor.submit(r1);
            }
                executor.shutdown();
        }
    }

