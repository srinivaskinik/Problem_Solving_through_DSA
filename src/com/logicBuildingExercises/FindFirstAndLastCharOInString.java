package com.logicBuildingExercises;

public class FindFirstAndLastCharOInString {

	public static void main(String[] args) {
		String input = "Hello World";
		int firstIndex = -1;
		int lastIndex = -1;

		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'o') {
				firstIndex = index;
				break;
			}
		}

		for (int index = input.length() - 1; index >= 0; index--) {
			if (input.charAt(index) == 'o') {
				lastIndex = index;
				break;
			}
		}

		if (firstIndex == -1) {
			System.out.println("Character o is not present");
		} else {
			System.out.println("first Index: " + firstIndex);
			System.out.println("last Index: " + lastIndex);
		}
	}

}
