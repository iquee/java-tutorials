package br.com.luiztaira.introduction;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by taira on 2/21/18.
 */
public class TestBigInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type numer 1: ");
        BigInteger bi1 = sc.nextBigInteger();

        System.out.println("Type numer 2: ");
        BigInteger bi2 = sc.nextBigInteger();

        System.out.println("n1 + n2 = " + bi1.add(bi2));
        System.out.println("n1 * n2 = " + bi1.multiply(bi2));

    }
}
