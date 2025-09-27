package com.logicBuildingExercises;

public class LargestNumberInTheArray {

	public static void main(String[] args) {
		int input[] = { 10, 20, 30, 40, 60, 50 };
		int largest = input[0];
		for (int index = 1; index <= input.length - 1; index++) {
			if (input[index] > largest) {
				largest = input[index];
			}
		}
		System.out.println(largest);

	}

}
