package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task11 {

	public static void main(String[] args) {
		String targetString = STRING_CASES[1];
		System.out.printf("Test case: %n" + targetString);
		System.out.printf("%n%nMax lower case letters count: %d", StringUtil.countCoincidencies(targetString, StringUtil.LOWER_LETTER, false));
		System.out.printf("%nMax upper case letters count: %d", StringUtil.countCoincidencies(targetString, StringUtil.UPPER_LETTER, false));
	}	

}
