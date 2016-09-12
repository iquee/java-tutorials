package br.com.luiztaira.introduction;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int option;
        String name;
        System.out.println("Choice a color: \n");
        System.out.println("1) blue\n");
        System.out.println("2) red\n");
        option = scan.nextInt();
        if (option == 1) {
            System.out.println("blue");
        } else if (option == 2) {
            System.out.println("red");
        } else {
            System.out.println("invalid");
        }
        // necessary extra nextLine(), because  the command nextInt() not consume the ENTER key(\n)
        name = scan.nextLine();
        System.out.println("Type your name: \n");
        name = scan.next();
        System.out.println(name);
    }

}
