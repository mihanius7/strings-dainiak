package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task7 {
	
	public static void main(String[] args) {
		for (String targetString : STRING_CASES) {
			System.out.printf("Test case: %n%s", targetString);
			System.out.printf("%nProcessed: %n%s%n%n", StringUtil.replaceIgnoreCase(targetString, "a", "ab"));
		}
	}

}
