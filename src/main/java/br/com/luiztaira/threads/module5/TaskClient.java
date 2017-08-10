package br.com.luiztaira.threads.module5;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by taira on 8/7/17.
 */
public class TaskClient {

    public static void main(String[] args) throws Exception{
        System.out.println("Trying connection...");
        Socket socket = new Socket("localhost", 12345);

        System.out.println("Connection established!");
        System.out.println("type something....");

        PrintStream out = new PrintStream(socket.getOutputStream());

        Scanner keyboard = new Scanner(System.in);
        while (keyboard.hasNextLine()){
            out.println(keyboard.nextLine());
        }

        socket.close();
    }
}
