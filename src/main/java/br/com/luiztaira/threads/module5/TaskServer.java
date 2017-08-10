

import br.com.luiztaira.threads.module5.TaskDistributor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by taira on 8/7/17.
 */
public class TaskServer {

    private static int number = 0;

    public static void main(String[] args)  throws Exception{

        System.out.println("Starting server....");
        ServerSocket server = new ServerSocket(12345);
        // newCachedThreadPool increase and descrease automatic after 60 sec
        ExecutorService threadPool = Executors.newCachedThreadPool();


        System.out.println("Waiting connections....");
        while (true){
            Socket socket = server.accept();
            System.out.println("    Connection accepted: port -> " + socket.getPort());

            TaskDistributor taskDistributor = new TaskDistributor(socket, ++number);
            threadPool.execute(taskDistributor);
        }
    }

}
