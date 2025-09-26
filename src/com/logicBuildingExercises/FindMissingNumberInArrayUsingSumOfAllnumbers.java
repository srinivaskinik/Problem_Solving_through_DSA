package com.logicBuildingExercises;

public class FindMissingNumberInArrayUsingSumOfAllnumbers {

	public static void main(String[] args) {
		int n = 6;
		int a[] = { 1, 2, 4, 5, 6 };
		int totalSumOfAllNumbers = n * (n + 1) / 2;

		// sum of all the elements
		int sumOfArray = 0;
		for (int i = 0; i < a.length; i++) {
			sumOfArray = a[i] + sumOfArray;
		}
		System.out.println("Missing number is: " + (totalSumOfAllNumbers - sumOfArray));

	}

}
