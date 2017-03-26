package br.com.luiztaira.algorithms;

public class Recursion {

    /**
     * Tail recursion will print in descending order
     * - very similar to iteration: for OR while
     * @param n
     */
    public static void tailRecursion(int n){
        if(n == 0) return;

        System.out.println(n);

        tailRecursion(n-1);
    }

    /**
     * Head recursion will print in ascending order
     * OS system stack memory in order to store reference of method
     * @param n
     */
    public static void headRecursion(int n){
        if(n == 0) return;

        headRecursion(n-1);

        System.out.println(n);
    }

    public static void main(String[] args) {
        tailRecursion(5);
        System.out.println("-----");
        headRecursion(5);
    }
}
