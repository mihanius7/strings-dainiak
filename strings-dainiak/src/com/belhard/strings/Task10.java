package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task10 {
	public static void main(String[] args) {
		String targetString = STRING_CASES[1];
		System.out.printf("Test case: %n%s", targetString);
		System.out.printf("%nThe longest word length is: %d%n%n", StringUtil.defineMaxCharInARow(targetString, "\\w+").maxCharsCount);
	}	
}
