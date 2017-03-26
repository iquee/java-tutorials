package br.com.luiztaira.algorithms;

public class Palindromes {

    public static void main(String[] args) {

        String str1 = "evitative";
        String str2 = "complexity";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));

    }

    /**
     *  This method
     *
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

}
