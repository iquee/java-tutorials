package br.com.luiztaira.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPart1 {

    public static void main(String[] args) {
        String str1 = "Java tutorial about Regex";
        String str2 = "Sox and Fox";
        String str3 = "All my 5 dogs";

        // SIMPLE CHARACTER CLASSES: Single chars enclosed in square brackets: []
        // find all characters inside brackets in a specific char sequence
        runRegex("[aeiou]", str1);
        System.out.println("---");
        // finds chars sequence started with either char S or char F plus "ox"
        runRegex("[SF]ox", str2);
        System.out.println("---");
        runRegex("[zYw]", str1);
        System.out.println("---");

        // NEGATION CHARACTER: ^ char followed by chars enclosed by square brackets
        runRegex("[^aeiou]", str1);
        System.out.println("---");
        runRegex("[^S]ox", str2);
        System.out.println("---");

        // RANGES: from firstChar to lastChat, chars separated by - enclosed by square brackets []
        runRegex("[a-d]", str1);
        System.out.println("---");
        runRegex("[A-Z]", str2);
        System.out.println("---");
        runRegex("[1-5]", str3);
        System.out.println("---");
        runRegex("[^1-5]", str3);
    }

    /**
     * Given a regex, find it on string
     *
     * @param regex
     * @param string
     */
    static void runRegex(String regex, String string){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        boolean foundIt = false;

        System.out.println("Regex: " + regex + " over \"" + string + "\"");
        while (matcher.find()){
            if (!matcher.group().isEmpty())
                System.out.println("Matcher found this: " + matcher.group());
            foundIt = true;
        }

        if (!foundIt)
            System.out.println("No matches found");
    }
}
