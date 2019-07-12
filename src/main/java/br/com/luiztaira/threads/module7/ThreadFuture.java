package br.com.luiztaira.threads.module7;

import java.util.concurrent.Callable;
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
	
	private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
       
        Future<Integer> future = (Future<Integer>) executorService.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				TimeUnit.SECONDS.sleep(3);
				Integer n = 0;				
				for (int i = 0; i < 100; i++) {
					n += i;
				}
				return n;
			}
		});
        
        try {
            Integer result = future.get(5, TimeUnit.SECONDS);
        	//Integer result = future.get();
            System.out.println("Result is: '" + result + "'.");
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
        executorService.shutdown();
    }
}
