package com.logicBuildingExercises;

import java.util.HashSet;

public class CountTheVowelsInAString_UsingHashSet {

	public static void main(String[] args) {
		String input = "Hello world";
		int count = 0;
		HashSet<Character> vowelSet = new HashSet<Character>();
		vowelSet.add('a');
		vowelSet.add('e');
		vowelSet.add('i');
		vowelSet.add('o');
		vowelSet.add('u');
		vowelSet.add('A');
		vowelSet.add('E');
		vowelSet.add('I');
		vowelSet.add('O');
		vowelSet.add('U');
		for (int index = 0; index < input.length(); index++) {
			if (vowelSet.contains(input.charAt(index))) {
				count++;
			}
		}

		System.out.println("Vowels count: " + count);

	}

}
