package br.com.luiztaira.introduction;

import java.util.*;

public class TestString {

    public static void main(String[] args) {

        // 1 - lexicographically/comparing
        //test1();

        // 2 - substring
        //test2();

        // 3 - lexicographically
        //test3();

        // 4 - Palindrome
        //test4();

        // 5 - Regex
        test5();

    }

    /**
     * 1) Sum the lengths of A and B.
     * 2) Determine if A is lexicographically larger than B (i.e.: does A come before B in the dictionary?).
     *    If yes, print Yes, if no print No
     * 3) Capitalize the first letter in A and B and print them on a single line, separated by a space.
     */
    static void test1(){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(A.replace(A.charAt(0), A.toUpperCase().charAt(0)) + " "+ B.replace(B.charAt(0), B.toUpperCase().charAt(0)));
    }

    /**
     * 1) The first line contains a single string denoting .
     * 2) The second line contains two space-separated integers denoting the respective values of start and end.
     */
    static void test2(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(s.substring(start, end));
    }


    /**
     * Input:
     * First line will consist a string containing english alphabets which has at most N characters.
     * 2nd line will consist an integer .
     *
     * Output
     * In the first line print the lexicographically minimum substring.
     * In the second line print the lexicographically maximum substring.
     */
    static void test3(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();

        String less = str.substring(0,k);
        String greater = str.substring(0,k);
        for (int i = 0; i <= str.length() - k; i ++){
            String s = str.substring(i, i + k);
            less = (less.compareTo(s) < 0 ? less : s);
            greater = (greater.compareTo(s) > 0 ? greater : s);
        }

        System.out.println(less);
        System.out.println(greater);
    }

    /**
     * Palindrome
     */
    static void test4(){
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        for (int i = 0; i < string.length() / 2; i++)
            if(string.charAt(i) != string.charAt(string.length() - i - 1)){
                System.out.println("No");
                return;
            }
        System.out.println("Yes");
    }

    /**
     * Regex: split string without special chars
     * print size of array
     */
    static void test5(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        if (s.length()>400000){
            return ;
        }else if (s.length()==0){
            System.out.println(0);
            return ;
        }else {
            // Regex:
            String[] words = s.split("[!,?.*_'@\\ ]+");
            System.out.println(words.length);
            for (String word : words)
                System.out.println(word);
        }
    }

}
