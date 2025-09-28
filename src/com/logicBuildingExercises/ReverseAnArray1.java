package com.logicBuildingExercises;

import java.util.Arrays;

public class ReverseAnArray1 {

	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 40 };
		int[] reverseInput = new int[input.length];

		int reverseIndex = 0;
		for (int index = input.length - 1; index >= 0; index--) {
			reverseInput[reverseIndex] = input[index];
			reverseIndex++;
		}
		input = reverseInput;
		for (int number : input) {
			System.out.print(number + " ");
		}
	}

}
