package com.logicBuildingExercises;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfChars_HashMap {

	public static void main(String[] args) {
		String input = "Madam";
		char[] inputArray = input.toLowerCase().toCharArray();
		Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
		for (char ch : inputArray) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}

		for (char key : frequencyMap.keySet()) {
			System.out.println(key + " " + frequencyMap.get(key));
		}

	}

}
