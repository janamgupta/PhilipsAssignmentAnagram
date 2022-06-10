package com.philips.assignment;

public class Anagram {

	public static void main(String[] args) {
		String one = "Dormitory";
		String two = "Dirty Room";
		Anagram anagram = new Anagram();
		String result = anagram.checkAnagram(one, two);
		System.out.println(result);
	}
	
	public String checkAnagram(String one, String two) {
		AnagramChecker anagramChecker = new AnagramChecker();
		boolean status = anagramChecker.isAnagram(one, two);
		
		if (status) {
			return "Is Anagram";
		} 
		
		return "Its not Anagram";
	}
}
