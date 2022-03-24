package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

public class Task1 {

	public static void main(String[] args) {
		String targetString = STRING_CASES[0];
		System.out.printf("Test case: %n" + targetString);
		System.out.printf("%n%nProcessed: %n" + StringUtil.camelToSnake(targetString));
	}

}
