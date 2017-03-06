package br.com.luiztaira.introduction;

import java.util.Scanner;

public class TestEOF {

    // Read some lines and print de content. Each line must have the line number before the string

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (in.hasNext()) {
            String s = in.nextLine();
            if (s.length() > 0)
                System.out.println(++i + " " + s);
        }
    }
}
