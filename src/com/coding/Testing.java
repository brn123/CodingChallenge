package com.coding;

import org.junit.Assert;
import org.junit.Test;

import com.pojo.PracticeObject;

public class Testing {
	
	@Test
	public void test() {
		
		
		String taskWord = "The cow jumped over the moon";
		Practice test = new Practice();
		PracticeObject result = test.wordLength(taskWord);
		
		PracticeObject pracOb = new PracticeObject();
		pracOb.setWord("jumped");
		pracOb.setWordLength(6);
		
		Assert.assertEquals("jumped", result.getWord());
		Assert.assertEquals(6, result.getWordLength());
		
		 
	}


}
