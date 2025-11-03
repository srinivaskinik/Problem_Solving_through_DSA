package com.logicBuildingExercises;

public class StringManipulation_RemoveExtraWhiteSpaces {

	public static void main(String[] args) {
		String input ="    Hello      World    ";
		input =input.trim().replaceAll("\\s+", " ");
		System.out.println(input);
	}
}
