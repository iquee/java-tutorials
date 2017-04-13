package br.com.luiztaira.algorithms;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "Debit Card";
        String str2 = "Bad Credit";

        System.out.println("Is '" + str1 + "' and '" + str2 +"' anagram?");
        System.out.println(isAnagram1(str1, str2));
    }

    /**
     * This method works and solve the problem
     * But the performance is'n efficient
     *
     * @param str1
     * @param str2
     * @return
     */
    static boolean isAnagram1(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;

        return Arrays.equals(
                str1.toLowerCase().chars().sorted().toArray(),
                str2.toLowerCase().chars().sorted().toArray());
    }
}
