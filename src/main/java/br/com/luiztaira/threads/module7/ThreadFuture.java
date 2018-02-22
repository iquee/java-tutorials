package br.com.luiztaira.threads.module7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by taira on 2/22/18.
 */
public class ThreadFuture {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> "result");

        try {
            String result = future.get(10, TimeUnit.SECONDS);
            System.out.println("Result is '" + result + "'.");
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
        catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
        assert future.isDone();
    }
}
