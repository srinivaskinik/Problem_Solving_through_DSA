package com.logicBuildingExercises;

public class CheckIfANumberIsPalindromeOrNot {

	public static void main(String[] args) {
		int number = 121;
		int copy = number;
		int reverseNumber = 0;
		int lastDigit;

		while (copy != 0) {
			lastDigit = copy % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
			copy = copy / 10;
		}
		if (reverseNumber == number) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

}
