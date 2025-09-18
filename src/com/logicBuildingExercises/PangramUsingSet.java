package com.logicBuildingExercises;

import java.util.HashSet;

public class PangramUsingSet {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		boolean result = checkPangram(input);
		if(result) {
			System.out.println("Is pangram");
		} else {
			System.out.println("Is not a pangram");
		}

	}

	private static boolean checkPangram(String input) {
		HashSet<Character> characterSet = new HashSet<Character>();
		char[] charArray = input.toLowerCase().toCharArray();
		for (char ch : charArray) {
			if (Character.isLetter(ch)) {
				characterSet.add(ch);
			}
		}
		if (characterSet.size() == 26) {
			return true;
		}
		return false;
	}

}
