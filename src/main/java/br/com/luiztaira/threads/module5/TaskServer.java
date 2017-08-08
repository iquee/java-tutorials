package br.com.luiztaira.threads1.module5;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by taira on 8/7/17.
 */
public class TaskServer {

    public static void main(String[] args)  throws Exception{

        System.out.println("Starting server....");
        ServerSocket server = new ServerSocket(12345);

        System.out.println("Waiting connections....");
        while (true){
            Socket socket = server.accept();
            System.out.println("    Connection accepted: port -> " + socket.getPort());

            TaskDistributor taskDistributor = new TaskDistributor(socket);
            Thread threadCliente = new Thread(taskDistributor);
            threadCliente.start();
        }
    }

}
