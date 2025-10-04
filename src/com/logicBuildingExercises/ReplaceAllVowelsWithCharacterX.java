package com.logicBuildingExercises;

public class ReplaceAllVowelsWithCharacterX {

	public static void main(String[] args) {
		String input = "Name";
		input = input.toLowerCase();
		StringBuilder sb = new StringBuilder();

		for (char currentChar : input.toCharArray()) {
			if (isVowel(currentChar)) {
				sb.append('x');
			} else {
				sb.append(currentChar);
			}
		}
		System.out.println(sb);
	}

	public static boolean isVowel(char currentChar) {
		if ((currentChar == 'a') || (currentChar == 'e') || (currentChar == 'i') || (currentChar == 'o')
				|| (currentChar == 'u')) {
			return true;
		} else {
			return false;
		}
	}
}
