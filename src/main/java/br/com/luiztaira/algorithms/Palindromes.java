package br.com.luiztaira.algorithms;

public class Palindromes {

    /**
     *  This method works fine and solve the problem,
     *  but is very inefficient because it uses a lot of memory.
     *
     *  Here is being used the following java methods:
     *  - String.equals()
     *  - StringBuilder.reverse()
     *  - StringBuilder.toString()
     *  - StringBuilder constructor
     *
     * @param str
     * @return
     */
    public static boolean isPalindrome1(String str) {
        return str.equals(
                new StringBuilder(str)
                        .reverse()
                        .toString());
    }

    /**
     * Better performance then isPalindrome1
     *
     * No extra memory is used here,
     * no objects are instantiated
     * and only half of string is checked
     *
     * @param str
     * @return
     */
    public static boolean isPalindrome2(String str) {
        int size = str.length();
        for (int i = 0; i < size/2; i++)
            if (str.charAt(i) != str.charAt(size-i-1))
                return false;
        return true;
    }

    public static void main(String[] args) {

        String str1 = "evitative";
        String str2 = "complexity";

        long start1 = System.nanoTime();
        System.out.println("function isPalindrome1");
        System.out.println(str1 + ": " + isPalindrome1(str1));
        System.out.println(str2 + ": " + isPalindrome1(str2));
        long elapsed1 = System.nanoTime() - start1;
        System.out.println("Time in NanoSeconds: " + (elapsed1/1000.0));

        System.out.println("\n");

        long start2 = System.nanoTime();
        System.out.println("function isPalindrome2");
        System.out.println(str1 + ": " + isPalindrome2(str1));
        System.out.println(str2 + ": " + isPalindrome2(str2));
        long elapsed2 = System.nanoTime() - start2;
        System.out.println("Time in NanoSeconds: " + (elapsed2/1000.0));

        System.out.println("\n----");

        // isPalindrome2 is always faster
        if(elapsed1 < elapsed2){
            // should never happen
            System.out.println("isPalindrome1 is "
                    + ((elapsed2 - elapsed1)/1000.0) + " ns faster then isPalindrome2");
        } else{
            System.out.println("isPalindrome2 is "
                    + ((elapsed1 - elapsed2)/1000.0) + " ns faster then isPalindrome1");
        }
    }
}