package com.coding;

import com.pojo.PracticeObject;

public class Practice {

	public PracticeObject wordLength(String s) {

		String[] splitSen = s.split(" ");
		String longestWord = "";
		PracticeObject senObject = new PracticeObject();

		for (String str : splitSen) {
			if (str.length() > longestWord.length()) {
				longestWord = str;
				senObject.setWord(longestWord.trim());
				senObject.setWordLength(longestWord.length());
			}
		}

		System.out.println(s);
		senObject.getWord();
		senObject.getWordLength();

		return senObject;
	}

}
