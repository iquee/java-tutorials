package br.com.luiztaira.algorithms;

/**
 * Factorial
 *
 * 5! = 5*4*3*2*1 || 5! = 120
 *
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println("----");
        System.out.println(calculateFactorialWithAccumulator(5));
    }

    /**
     * Recursive method.
     * Execute n times until return the result
     *
     * @param n
     * @return
     */
    private static int factorial(int n){
        if (n == 1) return 1;

        return n * factorial(n - 1);
    }

    /**
     * Recursive method.
     * But calculate and store the accumulator
     * then, return the accumulator without execute n times
     *
     * @param accumulator
     * @param n
     * @return
     */
    private static int factorialWithAcumulator(int accumulator, int n){
        // base case
        if(n == 1) return accumulator;

        return factorialWithAcumulator(n * accumulator, n -1);
    }
    private static int calculateFactorialWithAccumulator(int n){
        return factorialWithAcumulator(1, n);
    }
}
