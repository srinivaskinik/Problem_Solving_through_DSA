package com.logicBuildingExercises;

public class CheckIfANumberIsPalindromeOrNot_Using_StringBuilder {

	public static void main(String[] args) {
		int number = 1211;
		String originalNumberInString = Integer.toString(number);
		StringBuilder reverseStringBuilder = new StringBuilder(originalNumberInString);
		String reverseString = reverseStringBuilder.reverse().toString();
		
		if (reverseString.equals(originalNumberInString)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

}
