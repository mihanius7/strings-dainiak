package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	public static String camelToSnake(final String targetString) {
		Pattern regex = Pattern.compile("[a-z][A-Z]");
		Matcher matcher = regex.matcher(targetString);

		String output = new String(targetString);
		char letter1, letter2;
		String foundFragment, processedFragment;
		while (matcher.find()) {
			foundFragment = matcher.group();
			letter1 = foundFragment.charAt(0);
			letter2 = foundFragment.charAt(1);
			processedFragment = letter1 + "_" + letter2;
			output = output.replace(foundFragment, processedFragment.toLowerCase());
		}
		return output;
	}

	public static String replaceIgnoreCase(final String targetString, String word,
			String wordReplacement) {
		char[] lowerChars = word.toLowerCase().toCharArray();
		char[] upperChars = word.toUpperCase().toCharArray();
		String regexp = "";
		for (int i = 0; i < word.length(); i++)
			regexp = regexp.concat("[" + lowerChars[i] + "|" + upperChars[i] + "]");
		String output = targetString.replaceAll(regexp, wordReplacement);
		return output;
	}
}
