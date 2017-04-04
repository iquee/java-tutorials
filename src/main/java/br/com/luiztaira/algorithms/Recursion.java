package br.com.luiztaira.algorithms;

public class Recursion {

    /**
     * Tail recursion: the call of recursion occurs at the end of the method
     * and will print in descending order.
     * - very similar to iteration: for OR while
     * @param n
     */
    public static void tailRecursion(int n){
        //base case
        if(n == 0) return;

        System.out.println(n);

        tailRecursion(n-1);
    }

    /**
     * Head recursion: the call of recursion occurs at the beginning
     * and will print in ascending order.
     *
     * @param n
     */
    public static void headRecursion(int n){
        // base case
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
