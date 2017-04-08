package br.com.luiztaira.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regex introduction
 *
 * - A Pattern object is a compiled representation of a regex string literal
 * - Matcher class methods to perform various operations on a character sequence
 */
public class RegexIntroduction {

    public static void main(String[] args) {

        String searchMe = "This is my first Regex example: top, mop, nop";

        Pattern pattern = Pattern.compile("[mtn]op");
        Matcher matcher = pattern.matcher(searchMe);
        while (matcher.find())
            System.out.println("Matcher found: " + matcher.group() + " at position: " + matcher.start());

    }
}
