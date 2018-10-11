package com.coding;

import com.pojo.PracticeObject;

public class TestingCont {

	public static void main(String[] args) {
		
		//
		Practice sen = new Practice();
		PracticeObject senObj = new PracticeObject();
		senObj = sen.wordLength("The cow jumped over the moon");
		System.out.println("Longest word: " + senObj.getWord() + "\nWord Length : " + senObj.getWordLength() + " ");
	}

}
