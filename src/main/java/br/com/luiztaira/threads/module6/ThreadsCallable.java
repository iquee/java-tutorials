package br.com.luiztaira.threads.module6;

import java.util.concurrent.*;

/**
 * Implements Callable and ExecutorService we can wait a single thread end to start another
 */
public class ThreadsCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println("Executing callable... " + Thread.currentThread().getName());

        PrintNumbers pn = new PrintNumbers(10000);
        pn.run();

        return Thread.currentThread().getName() + " successfully executed\n";
    }

    public static void main(String[] args) throws Exception {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Future<String> submit1 = threadPool.submit(new ThreadsCallable());

        System.out.println(submit1.get(10, TimeUnit.SECONDS)); // block the threar until return the result. Or 10 seconds after

        if(submit1.isDone()){
            Future<String> submit2 = threadPool.submit(new ThreadsCallable());
            System.out.println(submit2.get());
        }

    }
}
