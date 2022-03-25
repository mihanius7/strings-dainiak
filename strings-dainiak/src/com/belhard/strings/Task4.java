package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task4 {

	public static void main(String[] args) {
		String targetString = STRING_CASES[2];
		System.out.printf("Test case: %n" + targetString);
		System.out.printf("%nNumbers count: " + StringUtil.countCoincidencies(targetString, StringUtil.NUMBERS, true));
	}
	
}