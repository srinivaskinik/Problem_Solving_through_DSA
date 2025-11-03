package com.logicBuildingExercises;

public class NameGenerator {

	public static void main(String[] args) {
		String names[] = { "Raj", "Rahul" };
		// output should be to print all the characters from each word vertically
		// eg: RRaajhul

		int maxLength = 0;
		for (String name : names) {
			maxLength = Math.max(maxLength, name.length());
		}

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < maxLength; i++) {
			for (String name : names) {
				if (i < name.length()) {
					result.append(name.charAt(i));
				}
			}
		}

		System.out.println(result.toString());
	}

}
