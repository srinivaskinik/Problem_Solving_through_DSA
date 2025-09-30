package com.logicBuildingExercises;

public class CountTheVowelsInAString {

	public static void main(String[] args) {
		String input = "Hello world";
		int count = 0;
		String vowels = "aeiouAEIOU";
		for (int index = 0; index < input.length(); index++) {
			if (vowels.indexOf(input.charAt(index)) != -1) {
				count++;
			}
		}

		System.out.println("Vowels count: " + count);

	}

}
