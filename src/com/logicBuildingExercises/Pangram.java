package com.logicBuildingExercises;

public class Pangram {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		// lowercase
		input = input.toLowerCase();
		boolean result = checkPangram(input);
		if (result) {
			System.out.println("Is a Pangram");
		} else {
			System.out.println("Not a pangram");
		}
	}

	private static boolean checkPangram(String input) {
		if (input.length() < 26) {
			return false;
		}

		for (char i = 'a'; i <= 'z'; i++) {
			//input.indexOf(i) returns -1 if not present
			if (input.indexOf(i) < 0) {
				return false;
			}
		}
		return true;
	}

}
