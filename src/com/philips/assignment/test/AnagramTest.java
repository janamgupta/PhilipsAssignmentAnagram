package com.philips.assignment.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.philips.assignment.Anagram;

class AnagramTest {
	Anagram anagram = new Anagram();
	
	@Test
	void displayIfAnagram() {
		assertEquals("Is Anagram", anagram.checkAnagram("Dirty Room", "Dormitory"));
	}
	
	@Test
	void displayIfNotAnagram() {
		assertEquals("Its not Anagram", anagram.checkAnagram("Dirty Broom", "Dormitory"));
	}
}
