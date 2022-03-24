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
}
