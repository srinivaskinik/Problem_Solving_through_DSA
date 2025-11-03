package com.logicBuildingExercises;

public class StringManipultation_WordFinder {

	public static void main(String[] args) {
		String input = "I love cricket and football";
		String words[] = input.split(" ");
		String shortestWord = words[0];
		String longestWord = words[0];

		for (String word : words) {
			if (word.length() < shortestWord.length()) {
				shortestWord = word;
			}
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		System.out.println("Shortest word: " + shortestWord);
		System.out.println("longest word: " + longestWord);

	}

}
