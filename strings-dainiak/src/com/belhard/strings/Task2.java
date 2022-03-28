package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task2 {

	public static void main(String[] args) {
		String targetString = STRING_CASES[1];
		System.out.printf("Test case: %n%s%n", targetString);
		System.out.printf("%nProcessed: %n" + StringUtil.replaceIgnoreCase(targetString, "black", "white"));
	}

}
