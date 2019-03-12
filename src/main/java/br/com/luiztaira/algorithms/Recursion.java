package br.com.luiztaira.algorithms;

public class Recursion {

    /**
     * Tail recursion: the call of recursion occurs at the end of the method
     * and will print in descending order.
     * - very similar to iteration: for OR while
     *
     * @param n
     * @return total
     */
    static int tailRecursion(int n) {
        //base case
        if (n == 0) return n;

        System.out.println(n);

        return n + tailRecursion(n - 1);
    }

    /**
     * Tail recursion, instead computing the sum on the way down the stack, here is sum it on the way up
     * avoiding unnecessary return, saving memory.
     *
     * @param n
     * @param total
     * @return total
     */
    static int tailRecursionWithTotal(int n, int total){

        if(n == 0) return total;

        System.out.println(n);

        return tailRecursionWithTotal(n -1 , total + n);
    }

    /**
     * Head recursion: the call of recursion occurs at the beginning of the method
     * and will print in ascending order.
     *
     * @param n
     */
    static void headRecursion(int n) {
        // base case
        if (n == 0) return;

        headRecursion(n - 1);

        System.out.println(n);
    }

    public static void main(String[] args) {
        int i = tailRecursion(5);
        System.out.println("sum: " + i);
        System.out.println("-----");
        int t = tailRecursionWithTotal(5, 0);
        System.out.println("sum: " + t);
        System.out.println("-----");
        headRecursion(5);
    }
}
