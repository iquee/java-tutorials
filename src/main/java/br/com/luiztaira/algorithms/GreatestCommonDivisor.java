package br.com.luiztaira.algorithms;

/**
 * A method to find the greatest common divisor - GCD
 * of two numbers.
 *
 */
public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(gcdRecursive(9,3));
    }

    /**
     * A recursive calls, until the n2 becomes 0
     *
     * @param n1
     * @param n2
     * @return
     */
    public static int gcdRecursive(int n1, int n2){
        if(n2 == 0)
            return n1;
        return gcdRecursive(n2, n1%n2);
    }
}