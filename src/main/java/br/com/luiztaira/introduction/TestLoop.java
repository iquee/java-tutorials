package br.com.luiztaira.introduction;

import java.util.Scanner;

public class TestLoop {

    public static void main(String[] args) {
        System.out.println("Type a number: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }

    }

}
