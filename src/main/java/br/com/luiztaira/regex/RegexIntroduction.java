package br.com.luiztaira.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regex introduction
 *
 * - A Pattern object is a compiled representation of a regex string literal -
 * Matcher class methods to perform various operations on a character sequence
 *
 * @see <a href="http://www.javacjava.com/RegexTutorials.aspx">Regex</a>
 * @see <a href="http://www.asciitable.com/">ASCII Table</a>
 *
 */
public class RegexIntroduction {

	public static void main(String[] args) {

		String searchMe = "This is my first Regex example: top, mop, nop";

		Pattern pattern = Pattern.compile("[mtn]op");
		Matcher matcher = pattern.matcher(searchMe);
		while (matcher.find())
			System.out.println("Matcher found: " + matcher.group() + " at position: " + matcher.start());

	}

	/**
	 * Given a regex, find it on string
	 *
	 * @param regex
	 * @param string
	 */
	static void runRegex(String regex, String string) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		boolean foundIt = false;

		System.out.println("Regex: " + regex + " over \"" + string + "\"");
		while (matcher.find()) {
			if (!matcher.group().isEmpty())
				System.out.println("Matcher found this: " + matcher.group());
			foundIt = true;
		}

		if (!foundIt)
			System.out.println("No matches found");
	}
}
