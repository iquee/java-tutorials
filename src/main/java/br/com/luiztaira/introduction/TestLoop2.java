package br.com.luiztaira.introduction;

import java.util.Scanner;

public class TestLoop2 {
    public static void main(String[] argh) {
        /**
        First number, is the iteration
        Given 3 more numbers(a, b, n) and calculate:
        (a+2^0*b), (a+2^1*b),...,(a+2^0*b + a+2^1*b + ... + a+2^n-1*b)
        */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int s = a;
            for (int j = 0; j < n; ++j) {
                s += b * ((int) (Math.pow(2, j)));
                System.out.print(s + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
