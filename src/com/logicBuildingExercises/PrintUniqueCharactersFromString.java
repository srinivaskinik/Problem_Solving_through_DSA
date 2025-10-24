package com.logicBuildingExercises;

import java.util.LinkedHashSet;

public class PrintUniqueCharactersFromString {

	public static void main(String[] args) {
		String input = "abbacdaab";
		// output abcd. Only take first occurece of each character
		// duplicate characters are not allowed
		// maintain the order

		char charArray[] = input.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (char ch : charArray) {
			set.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		for (char ch : set) {
			sb.append(ch);
		}
		System.out.println(sb);

	}

}
