package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task6 {
	
 public static void main(String[] args) {
		String targetString = STRING_CASES[3];
		System.out.printf("Test case: %n%s%n", targetString);
		System.out.printf("%nMax spaces count: %d", StringUtil.defineMaxCharInARow(targetString, " ").maxCharsCount);
	}	

}