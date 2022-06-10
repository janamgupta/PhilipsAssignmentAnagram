package com.philips.assignment.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.philips.assignment.AnagramChecker;

class AnagramCheckerTest {
	
	AnagramChecker anagramChecker = new AnagramChecker();
	@Test
	void isAnagram() {
		assertTrue(anagramChecker.isAnagram("Dormitory", "Dirty Room"));
	}

	@Test
	void isNotAnagram() {
		assertFalse(anagramChecker.isAnagram("Dormitory", "Dirty Broom"));
	}
	
	@Test
	void isModified() {
		assertEquals("dirtyroom",anagramChecker.getModifiedString("Dirty Room"));
	}
	
	@Test
	void isconvertedToCharArray() {
		char [] c = {'d','o','r','m','i','t','o','r','y'};
		assertArrayEquals(c, anagramChecker.getCharaterArray("dormitory"));
	}
}
