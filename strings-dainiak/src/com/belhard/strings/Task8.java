package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task8 {

	public static void main(String[] args) {
		for (String targetString : STRING_CASES) {
			System.out.printf("%n%nTest case: %n" + targetString);
			System.out.printf("%n\tIs palindrome: " + StringUtil.isPalindrome(targetString, true));
		}
	}
}
