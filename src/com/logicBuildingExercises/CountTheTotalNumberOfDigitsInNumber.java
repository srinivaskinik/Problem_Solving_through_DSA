package com.logicBuildingExercises;

public class CountTheTotalNumberOfDigitsInNumber {
	public static void main(String[] args) {
		int number = 1234;
		int count = 0;

		// approach 2 - Using String
		String s1 = Integer.toString(number);
		String s2 = number + "";
		System.out.println(s1.length());
		System.out.println(s2.length());

		while (number != 0) {
			int lastDigit = number % 10;
			number = number / 10;
			count++;
		}
		System.out.println(count);
	}

}
