package com.logicBuildingExercises;

public class ReverseTheCaseInAString {

	public static void main(String[] args) {
		String input = "Hello World";
		char[] charArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : charArray) {
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			} else {
				sb.append(c);
			}
		}

		System.out.println(sb.toString());

	}

}
