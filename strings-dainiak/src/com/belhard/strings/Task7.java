package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task7 {

	public static void main(String[] args) {
		for (String targetString : STRING_CASES) {
			System.out.printf("%n%nTest case: %n%s", targetString);
			System.out.printf("%n%nProcessed: %n" + StringUtil.replaceIgnoreCase(targetString, "a", "ab"));
		}
	}

}
