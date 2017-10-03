package br.com.luiztaira.regex;

public class RegexPart2 {

	public static void main(String[] args) {
		String str1 = "Java tutorial About Regex: [Part 2]";

		// UNIONS: Nested character classes contained inside square brackets
		RegexIntroduction.runRegex("[aeiou[0-9]]", str1);
		System.out.println("---");
		// same result
		RegexIntroduction.runRegex("[aeiou0-9]", str1);
		System.out.println("---");

		// INTERSECTIONS · NESTED CHARACTER CLASSES CONTAINED INSIDE SQUARE BRACKETS
		// SEPARATED By &&
		RegexIntroduction.runRegex("[aeiou&&[ae]]", str1);
		System.out.println("---");

		// SUBTRACTION · NESTED CHARACTER CLASSES CONTAINED INSIDE SQUARE BRACKETS
		// SEPARATED WITH && WITH AT LEAST ONE CHARACTER CLASS CONTAINING THE "^"
		// NEGATION METACHARACTER
		RegexIntroduction.runRegex("[A-z&&[^aeiou]]", str1); // only consonants and return '[' and ']'. See ASCII table
		System.out.println("---");
		RegexIntroduction.runRegex("[a-z[A-Z]&&[^aeiou]]", str1);
		System.out.println("---");
	}

}
