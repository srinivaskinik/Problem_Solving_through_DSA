package com.logicBuildingExercises;

import java.util.HashMap;

public class CountFrequencyOfSpecialChars_HashMap {

	public static void main(String[] args) {
		String input = "abs #!#";
		char[] charArray = input.toCharArray();
		HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

		for (char character : charArray) {
			if (!((character >= 'a' && character < 'z') || (character >= 'A' && character < 'Z')
					|| (character >= '0' && character < '9') || character == ' ')) {
				frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
			}
		}

		for (char ch : frequencyMap.keySet()) {
			System.out.println(ch + " " + frequencyMap.get(ch));
		}
	}

}
