package com.belhard.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	public static final String DIGITS = "\\d";
	public static final String NUMBERS = "[0-9]*\\.?[0-9]+";

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

	public static String replaceIgnoreCase(final String targetString, String word, String wordReplacement) {
		char[] lowerChars = word.toLowerCase().toCharArray();
		char[] upperChars = word.toUpperCase().toCharArray();
		String regexp = "";
		for (int i = 0; i < word.length(); i++)
			regexp = regexp.concat("[" + lowerChars[i] + "|" + upperChars[i] + "]");
		return targetString.replaceAll(regexp, wordReplacement);
	}

	public static int countCoincidencies(String targetString, String regexp, boolean printFound) {
		int count = 0;
		Pattern regex = Pattern.compile(regexp);
		Matcher matcher = regex.matcher(targetString);
		if (printFound)
			System.out.print("\nFound: ");
		while (matcher.find()) {
			count++;
			if (printFound)
				System.out.print("'" + matcher.group() + "', ");
		}
		return count;
	}

	public static String cleanSpaces(final String targetString) {
		String output = new String(targetString);
		output = output.replaceAll("\\s{2,}", " ");
		Pattern regex = Pattern.compile("\\s[,.:;?!)>}]");
		Matcher matcher = regex.matcher(output);
		String foundFragment;
		char punctuationMark;
		while (matcher.find()) {
			foundFragment = matcher.group();
			punctuationMark = foundFragment.charAt(1);
			output = output.replace(foundFragment, String.valueOf(punctuationMark));
		}
		return output.trim();
	}

	public static TheSameChars defineMaxCharInARow(final String targetString, String targetChar) {
		TheSameChars result = new TheSameChars();
		Pattern regex = Pattern.compile(targetChar + "+");
		Matcher matcher = regex.matcher(targetString);
		while (matcher.find()) {
			if (matcher.group().length() > result.maxCharsCount) {
				result.maxCharsCount = matcher.group().length();
				result.startPosition = targetString.indexOf(matcher.group());
			}
		}
		return result;
	}

	public static class TheSameChars {
		public int startPosition, maxCharsCount;
	}

	public static boolean isPalindrome(final String targetString) {
		String analyzedString = extractLetters(targetString);		
		System.out.println("String for palindrome analyze: '" + analyzedString + "'");
		if (analyzedString.isEmpty())
			return false;
		int stringLength = analyzedString.length();
		char fromBeginning, fromEnding;
		for (int i = 0; i < stringLength / 2; i++) {
			fromBeginning = Character.toLowerCase(analyzedString.charAt(i));
			fromEnding = Character.toLowerCase(analyzedString.charAt(stringLength - i - 1));
			System.out.println(fromBeginning + " <-> " + fromEnding);
			if (fromBeginning != fromEnding)
				return false;
		}
		return true;
	}

	public static String extractLetters(final String targetString) {
		return targetString.toLowerCase().replaceAll("[^a-z\\d]+", "");
	}
}
