package com.logicBuildingExercises;

public class FindSecondLargestNumberFromSring {

	public static void main(String[] args) {
		String input = "abc321";
		findSecondLargest(input);

	}

	private static void findSecondLargest(String input) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int num;
		char charArray[] = input.toCharArray();
		for (char ch : charArray) {
			if (Character.isDigit(ch)) {
				num = ch - '0'; // convert character into integer
				if (num > first) {
					second = first;
					first = num;
				} else if (num > second && num < first) {
					second = num;
				}
			}

		}
		System.out.println("Second largest number is " + second);

	}

}
