package com.philips.assignment;

import java.util.Arrays;

public class AnagramChecker {
	
	public boolean isAnagram(String s1, String s2) {
		AnagramChecker anagramChecker = new AnagramChecker();
		String str1 = getModifiedString(s1);
		String str2 = getModifiedString(s2);
		
		boolean isAnagram = true;
		
		
		if(str1.length() != str2.length()) {
			isAnagram = false;
		} else {
			char[] c1 = new char[str1.length()];
			char[] c2 = new char[str2.length()];
			
			c1 = anagramChecker.getCharaterArray(str1);
			c2 = anagramChecker.getCharaterArray(str2);
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			isAnagram = Arrays.equals(c1, c2);
		}
		
		return isAnagram;
	}
	
	/*
	 * This method removes whitespace from string and convert it into lower case
	 */
	
	public String getModifiedString(String unModifiedString) {
		
		return unModifiedString.replaceAll(" ", "").toLowerCase();
	}
	
	/*
	 * This method converts string to character array
	 */
	
	public char[] getCharaterArray(String str) {
		
		return str.toCharArray();
	}
}
