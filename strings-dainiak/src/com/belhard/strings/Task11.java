package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task11 {

	public static void main(String[] args) {
		String targetString = STRING_CASES[2];
		System.out.printf("Test case: %n%s%n", targetString);
		System.out.printf("%nMax lower case letters count: %d", StringUtil.countCoincidencies(targetString, StringUtil.LOWER_LETTERS, true));
	}	

}
