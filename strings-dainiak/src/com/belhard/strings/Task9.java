package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task9 {

	public static void main(String[] args) {
		String targetString = STRING_CASES[6];
		System.out.printf("Test case: %n%s", targetString);
		System.out.printf("%nChars found: %d%n%n", StringUtil.countCoincidencies(targetString, "e", true));
	}

}
