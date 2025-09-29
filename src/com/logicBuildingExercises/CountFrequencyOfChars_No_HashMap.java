package com.logicBuildingExercises;

public class CountFrequencyOfChars_No_HashMap {
	public static void main(String[] args) {
		String input = "abccaa";
		char[] inputArray = input.toCharArray();
		int[] frequency = new int[255];
		for (char ch : inputArray) {
			frequency[ch] = frequency[ch] + 1;
		}

		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 0) {
				System.out.println((char) (i) + " " + frequency[i]);
			}
		}
	}
}
