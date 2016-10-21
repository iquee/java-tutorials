package br.com.luiztaira.introduction;

import java.util.Scanner;

public class TestDataTypes {
    public static void main(String[] args) {
        {
            /* Given a input number, check in which primitive type are capable to store that input */
            System.out.println("Type a number: ");
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                try {
                    long x = sc.nextLong();
                    System.out.println(x + " can be fitted in:");
                    if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte");
                    if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                    if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                    if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
                } catch (Exception e) {
                    System.out.println(sc.next() + " can't be fitted anywhere.");
                }
            }
        }
    }
}

