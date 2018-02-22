package br.com.luiztaira.threads.module7;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadsInQueue {

    public static void main(String[] args) throws InterruptedException {

        // BlockingQueue methods come in four forms,
        // with different ways of handling operations that cannot be satisfied immediately,
        // but may be satisfied at some point in the future

        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(3);
        blockingQueue.put("c1");
        blockingQueue.put("c2");
        blockingQueue.put("c3");
        //blockingQueue.put("c4"); //should stop here and waiting. Comment to pass

        // take: Retrieves and removes the head of this queue, waiting if necessary until an element becomes available.
        System.out.println(blockingQueue.take());
        //System.out.println(blockingQueue.take());
        //System.out.println(blockingQueue.take());
        //System.out.println(blockingQueue.take()); //should stop here and waiting. Comment to pass

        System.out.println(blockingQueue);
        System.out.println(blockingQueue.size());

    }
}
