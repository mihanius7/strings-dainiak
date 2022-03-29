package com.belhard.strings;

import static com.belhard.strings.DemoStrings.STRING_CASES;

import com.belhard.util.StringUtil;
import com.belhard.util.StringUtil.StringFragment;

public class Task10 {
	public static void main(String[] args) {
		for (String targetString : STRING_CASES) {
			System.out.printf("%n%nTest case: %n" + targetString);
			StringFragment longestWord = StringUtil.defineMaxCharInARow(targetString, "\\w+");
			System.out.printf("%nThe longest word is: '%s', length %d", longestWord.content, longestWord.charsCount);
		}
	}
}
