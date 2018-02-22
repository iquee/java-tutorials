package br.com.luiztaira.collections;

import java.time.Year;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by taira on 2/22/18.
 */
public class StaticInitializer {

    // Publishing an immutable object without additional initialization
    public static final Year year = Year.of(2017);
    public static final Set<String> keywords;

    // Only static method can change static variables
    static {
        // Creating mutable set
        Set<String> keywordsSet = new HashSet<>();
        // Initializing state
        keywordsSet.add("java");
        keywordsSet.add("jdk");
        // Making set unmodifiable
        keywords = Collections.unmodifiableSet(keywordsSet);
    }

    public static void main(String[] args) {
        System.out.println(year);
        for (String s : keywords)
            System.out.println(s);
    }

}
