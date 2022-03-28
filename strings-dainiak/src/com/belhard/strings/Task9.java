package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task9 {

	public static void main(String[] args) {
		char ch = 'e';
		for (String targetString : STRING_CASES) {
			System.out.printf("Test case: %n%s", targetString);
			System.out.printf("%nChar '" + ch + "' found: %d%n%n",
					StringUtil.countCoincidencies(targetString, String.valueOf(ch), false));
		}
	}

}
