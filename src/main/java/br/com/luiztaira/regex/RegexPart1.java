package br.com.luiztaira.regex;

public class RegexPart1 {

	public static void main(String[] args) {
		String str1 = "Java tutorial about Regex: Part 1";
		String str2 = "Sox and Fox and zox and Yox and yox";
		String str3 = "All my 5 dogs";

		// SIMPLE CHARACTER CLASSES: Single chars enclosed in square brackets: []
		// find all characters inside brackets in a specific char sequence
		RegexIntroduction.runRegex("[aeiou]", str1);
		System.out.println("---");
		// finds chars sequence started with either char S or char F plus "ox"
		RegexIntroduction.runRegex("[SF]ox", str2);
		System.out.println("---");
		// finds chars sequence started with zm Y or w
		RegexIntroduction.runRegex("[zYw]ox", str2);
		System.out.println("---");

		// NEGATION CHARACTER: ^ char followed by chars enclosed by square brackets
		RegexIntroduction.runRegex("[^aeiou]", str1);
		System.out.println("---");
		RegexIntroduction.runRegex("[^S]ox", str2);
		System.out.println("---");

		// RANGES: from firstChar to lastChat, chars separated by - enclosed by square
		// brackets []
		RegexIntroduction.runRegex("[a-d]", str1);
		System.out.println("---");
		RegexIntroduction.runRegex("[A-Z]", str2);
		System.out.println("---");
		RegexIntroduction.runRegex("[1-5]", str3);
		System.out.println("---");
		RegexIntroduction.runRegex("[^1-5]", str3);
	}
}
