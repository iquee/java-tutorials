package br.com.luiztaira.threads.module7;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadsInQueue {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(3);
        blockingQueue.put("c1");
        blockingQueue.put("c2");
        blockingQueue.put("c3");

        blockingQueue.put("c4"); //should stop here and waiting. Comment to pass

        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());

        System.out.println(blockingQueue.take()); //should stop here and waiting. Comment to pass

        System.out.println(blockingQueue.size());

    }
}
