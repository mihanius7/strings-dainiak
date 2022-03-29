package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;

public class Task12 {

	public static void main(String[] args) {
		for (String targetString : STRING_CASES) {
			System.out.printf("Test case: %n" + targetString + "%n");
			System.out.printf("Sentences count: %d%n%n",
					StringUtil.countCoincidencies(targetString, StringUtil.SENTENCE, false));
		}
	}

}
