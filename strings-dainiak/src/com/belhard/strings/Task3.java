package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task3 {

	public static void main(String[] args) {
		String targetString = STRING_CASES[2];
		System.out.printf("Test case: %n%s%n", targetString);
		System.out.printf("%nDigits found: " + StringUtil.countCoincidencies(targetString, StringUtil.DIGITS, true));
	}

}
