package com.logicBuildingExercises;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersFromString {

	public static void main(String[] args) {
		String input = "Java";
		char[] chArray = input.toCharArray();
		Set<Character> linkedHashSet = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for (char character : chArray) {
			if (linkedHashSet.add(character)) {
				sb.append(character);
			}
		}
		System.out.println(sb);
	}
}
