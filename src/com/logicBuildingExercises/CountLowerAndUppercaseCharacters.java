package com.logicBuildingExercises;

public class CountLowerAndUppercaseCharacters {

	public static void main(String[] args) {
		String input = "aAbBcD";
		char charArray[] = input.toCharArray();
		int lowercaseCount = 0;
		int uppercaseCount = 0;
		for (char ch : charArray) {
			if (Character.isUpperCase(ch)) {
				uppercaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowercaseCount++;
			}
		}
		System.out.println("Lower case characters count: "+lowercaseCount);
		System.out.println("Upper case characters count: "+uppercaseCount);
	}

}
