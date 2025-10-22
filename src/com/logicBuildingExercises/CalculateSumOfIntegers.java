package com.logicBuildingExercises;

public class CalculateSumOfIntegers {

	public static void main(String[] args) {
		String input = "This is 1000 and it should be 20 30 50 and 1050";
		int result = sum(input);
		System.out.println(result);
	}

	private static int sum(String input) {
		String words[] = input.split(" ");
		int sum = 0;
		for (String word : words) {
			try {
				int val = Integer.parseInt(word);
				sum += val;
			} catch (Exception e) {

			}
		}
		return sum;
	}

}
